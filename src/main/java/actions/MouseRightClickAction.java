package actions;

import base.InputController;

public class MouseRightClickAction extends MouseAction{

    public MouseRightClickAction(InputController mouse, Point[] bounds, int wait_time, String name) {
        super(mouse, bounds, wait_time);
        this.name = name;
    }

    public MouseRightClickAction(InputController mouse, Point center, int size, int wait_time, String name) {
        super(mouse, center, size, wait_time);
        this.name = name;
    }

    public void execute() throws InterruptedException {
        mouse.move(Point.get_random_point(bounds));
        mouse.right_click();
    }

}
