package crud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import crud.model.User;
import crud.service.UserService;


@Controller
@RequestMapping("/users")
public class UserController {

        private UserService userService;

        @Autowired
        public UserController(UserService userService) {
            this.userService = userService;
        }

        @GetMapping()
        public String getUsers(Model model) {
            model.addAttribute("users", userService.index());
            return "users";

        }

        @GetMapping("/{id}")
        public String getById(@PathVariable("id") int id, Model model) {
            model.addAttribute("user", userService.showUser(id));
            return "serchById";
        }

        @GetMapping("/new")
        public String newUser(@ModelAttribute("user") User user) {
            return "new";
        }

        @PostMapping
        public String createNewUser(@ModelAttribute("user") User user) {
            userService.save(user);
            return "redirect:/users";
        }

        @GetMapping("/{id}/edit")
        public String editUser(Model model, @PathVariable("id") int id) {
            model.addAttribute("user", userService.showUser(id));
            return "edit";
        }

        @PatchMapping("/{id}")
        public String updateUser(@ModelAttribute("user") User user, @PathVariable("id") int id) {
            userService.update(user);
            return "redirect:/users";
        }

        @DeleteMapping("/{id}")
        public String deleteUser(@PathVariable("id") int id) {
            userService.deleteUser(id);
            return "redirect:/users";
        }

}