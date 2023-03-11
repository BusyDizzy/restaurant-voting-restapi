package com.antontkatch.restaurant.web;

import com.antontkatch.restaurant.model.Dish;
import com.antontkatch.restaurant.service.DishService;
import com.antontkatch.restaurant.service.MenuService;
import com.antontkatch.restaurant.service.VoteService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.util.Arrays;

public class SpringMain {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext()) {
            appCtx.setConfigLocations("spring/spring-app.xml", "spring/spring-db.xml");
            appCtx.refresh();
            {
                System.out.println("Bean definition names: " + Arrays.toString(appCtx.getBeanDefinitionNames()));
//                AdminRestController adminUserController = appCtx.getBean(AdminRestController.class);
//                adminUserController.create(new User(null, "userName", "email@mail.ru", "password", Role.ADMIN));

                DishService dishService = appCtx.getBean(DishService.class);

                System.out.println(dishService.get(100009, 100006));
                System.out.println(dishService.getAll(100006));

                Dish dish = new Dish("Dumplings", 11.99);
                dishService.create(dish, 100008);
                System.out.println(dishService.getAll(100008));

                dish.setPrice(8.88);
                dishService.create(dish, 100008);
                System.out.println(dishService.getAll(100008));

                MenuService menuService = appCtx.getBean(MenuService.class);
                System.out.println(menuService.get(100006, 100003));

                VoteService voteService = appCtx.getBean(VoteService.class);
                System.out.println(voteService.getAll(100003, LocalDate.of(2023, 03, 06)));
                System.out.println(voteService.getAllRestaurantVotes(100004));
                System.out.println(voteService.getAllUserVotes(100000));
                System.out.println(voteService.getAllDailyVotes(LocalDate.of(2023, 03, 06)));
            }
        }
    }
}
