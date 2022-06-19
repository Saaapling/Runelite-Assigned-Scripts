package image_parsing;

import actions.Point;

public class Offsets {

    // Status Offsets
    public static final int health_x_offset = 240;
    public static final int health_y_offset = 84;
    public static final int prayer_x_offset = 240;
    public static final int prayer_y_offset = 118;
    public static final int stamina_x_offset = 231;
    public static final int stamina_y_offset = 151;
    public static final int fullscreen_offset = 4;

    // Bank Offsets (All size/width/height values are halves (to calculate starting from the center)
    public static final int bank_base_x = 662;
    public static final int bank_base_y = 137;
    public static final int bank_item_size = 12;
    public static final int bank_slot_width = 48;
    public static final int bank_slot_height = 36;
    public static final int bank_withdraw_x_height_offset = 72;
    public static final int bank_withdraw_x_width = 50;
    public static final int bank_withdraw_x_height = 6;


    public static Point get_bank_coordinate(int row, int col){
        return new Point(bank_base_x + (col - 1) * bank_slot_width, bank_base_y + (row - 1) * bank_slot_height);
    }

}
