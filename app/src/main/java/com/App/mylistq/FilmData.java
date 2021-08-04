package com.App.mylistq;

import java.util.ArrayList;

public class FilmData {
    private static String[] judulFilm = {
            "anim satu",
            "anim dua",
            "anim tiga",
            "anim empat",
            "anim lima",
            "anim enam",
            "anim tujuh",
            "anim delapan",
            "anim sembilan",
            "anim sepuluh"
    };

    private static String[] sinopsis = {
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Purus ut faucibus pulvinar elementum integer enim neque. Pharetra diam sit amet nisl suscipit. Vitae nunc sed velit dignissim sodales. Pellentesque elit eget gravida cum sociis natoque penatibus et magnis. Proin sagittis nisl rhoncus mattis. Volutpat est velit egestas dui. Lacus sed viverra tellus in hac. Vehicula ipsum a arcu cursus. Tristique risus nec feugiat in. Eget est lorem ipsum dolor sit. Iaculis eu non diam phasellus vestibulum lorem sed. Tincidunt dui ut ornare lectus. At quis risus sed vulputate odio ut. Cursus eget nunc scelerisque viverra mauris.\n",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Purus ut faucibus pulvinar elementum integer enim neque. Pharetra diam sit amet nisl suscipit. Vitae nunc sed velit dignissim sodales. Pellentesque elit eget gravida cum sociis natoque penatibus et magnis. Proin sagittis nisl rhoncus mattis. Volutpat est velit egestas dui. Lacus sed viverra tellus in hac. Vehicula ipsum a arcu cursus. Tristique risus nec feugiat in. Eget est lorem ipsum dolor sit. Iaculis eu non diam phasellus vestibulum lorem sed. Tincidunt dui ut ornare lectus. At quis risus sed vulputate odio ut. Cursus eget nunc scelerisque viverra mauris.\n",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Purus ut faucibus pulvinar elementum integer enim neque. Pharetra diam sit amet nisl suscipit. Vitae nunc sed velit dignissim sodales. Pellentesque elit eget gravida cum sociis natoque penatibus et magnis. Proin sagittis nisl rhoncus mattis. Volutpat est velit egestas dui. Lacus sed viverra tellus in hac. Vehicula ipsum a arcu cursus. Tristique risus nec feugiat in. Eget est lorem ipsum dolor sit. Iaculis eu non diam phasellus vestibulum lorem sed. Tincidunt dui ut ornare lectus. At quis risus sed vulputate odio ut. Cursus eget nunc scelerisque viverra mauris.\n",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Purus ut faucibus pulvinar elementum integer enim neque. Pharetra diam sit amet nisl suscipit. Vitae nunc sed velit dignissim sodales. Pellentesque elit eget gravida cum sociis natoque penatibus et magnis. Proin sagittis nisl rhoncus mattis. Volutpat est velit egestas dui. Lacus sed viverra tellus in hac. Vehicula ipsum a arcu cursus. Tristique risus nec feugiat in. Eget est lorem ipsum dolor sit. Iaculis eu non diam phasellus vestibulum lorem sed. Tincidunt dui ut ornare lectus. At quis risus sed vulputate odio ut. Cursus eget nunc scelerisque viverra mauris.\n",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Purus ut faucibus pulvinar elementum integer enim neque. Pharetra diam sit amet nisl suscipit. Vitae nunc sed velit dignissim sodales. Pellentesque elit eget gravida cum sociis natoque penatibus et magnis. Proin sagittis nisl rhoncus mattis. Volutpat est velit egestas dui. Lacus sed viverra tellus in hac. Vehicula ipsum a arcu cursus. Tristique risus nec feugiat in. Eget est lorem ipsum dolor sit. Iaculis eu non diam phasellus vestibulum lorem sed. Tincidunt dui ut ornare lectus. At quis risus sed vulputate odio ut. Cursus eget nunc scelerisque viverra mauris.\n",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Purus ut faucibus pulvinar elementum integer enim neque. Pharetra diam sit amet nisl suscipit. Vitae nunc sed velit dignissim sodales. Pellentesque elit eget gravida cum sociis natoque penatibus et magnis. Proin sagittis nisl rhoncus mattis. Volutpat est velit egestas dui. Lacus sed viverra tellus in hac. Vehicula ipsum a arcu cursus. Tristique risus nec feugiat in. Eget est lorem ipsum dolor sit. Iaculis eu non diam phasellus vestibulum lorem sed. Tincidunt dui ut ornare lectus. At quis risus sed vulputate odio ut. Cursus eget nunc scelerisque viverra mauris.\n",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Purus ut faucibus pulvinar elementum integer enim neque. Pharetra diam sit amet nisl suscipit. Vitae nunc sed velit dignissim sodales. Pellentesque elit eget gravida cum sociis natoque penatibus et magnis. Proin sagittis nisl rhoncus mattis. Volutpat est velit egestas dui. Lacus sed viverra tellus in hac. Vehicula ipsum a arcu cursus. Tristique risus nec feugiat in. Eget est lorem ipsum dolor sit. Iaculis eu non diam phasellus vestibulum lorem sed. Tincidunt dui ut ornare lectus. At quis risus sed vulputate odio ut. Cursus eget nunc scelerisque viverra mauris.\n",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Purus ut faucibus pulvinar elementum integer enim neque. Pharetra diam sit amet nisl suscipit. Vitae nunc sed velit dignissim sodales. Pellentesque elit eget gravida cum sociis natoque penatibus et magnis. Proin sagittis nisl rhoncus mattis. Volutpat est velit egestas dui. Lacus sed viverra tellus in hac. Vehicula ipsum a arcu cursus. Tristique risus nec feugiat in. Eget est lorem ipsum dolor sit. Iaculis eu non diam phasellus vestibulum lorem sed. Tincidunt dui ut ornare lectus. At quis risus sed vulputate odio ut. Cursus eget nunc scelerisque viverra mauris.\n",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Purus ut faucibus pulvinar elementum integer enim neque. Pharetra diam sit amet nisl suscipit. Vitae nunc sed velit dignissim sodales. Pellentesque elit eget gravida cum sociis natoque penatibus et magnis. Proin sagittis nisl rhoncus mattis. Volutpat est velit egestas dui. Lacus sed viverra tellus in hac. Vehicula ipsum a arcu cursus. Tristique risus nec feugiat in. Eget est lorem ipsum dolor sit. Iaculis eu non diam phasellus vestibulum lorem sed. Tincidunt dui ut ornare lectus. At quis risus sed vulputate odio ut. Cursus eget nunc scelerisque viverra mauris.\n",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Purus ut faucibus pulvinar elementum integer enim neque. Pharetra diam sit amet nisl suscipit. Vitae nunc sed velit dignissim sodales. Pellentesque elit eget gravida cum sociis natoque penatibus et magnis. Proin sagittis nisl rhoncus mattis. Volutpat est velit egestas dui. Lacus sed viverra tellus in hac. Vehicula ipsum a arcu cursus. Tristique risus nec feugiat in. Eget est lorem ipsum dolor sit. Iaculis eu non diam phasellus vestibulum lorem sed. Tincidunt dui ut ornare lectus. At quis risus sed vulputate odio ut. Cursus eget nunc scelerisque viverra mauris.\n"
    };

    private static int[] cover = {
        R.drawable.beras_mathi,
            R.drawable.beras_merah,
            R.drawable.cabai,
            R.drawable.daun_salam,
            R.drawable.kayu_manis,
            R.drawable.ketumbar,
            R.drawable.lada,
            R.drawable.lada_hitam,
            R.drawable.kunyit,
            R.drawable.jahe,
            R.drawable.cabai
    };

    static ArrayList<Film> getListData() {
        ArrayList<Film> list = new ArrayList<>();
        for (int position = 0; position < judulFilm.length; position++) {
            Film film = new Film();
            film.setJudul(judulFilm[position]);
            film.setSinopsis(sinopsis[position]);
            film.setCover(cover[position]);
            list.add(film);
        }
        return list;
    }
}
