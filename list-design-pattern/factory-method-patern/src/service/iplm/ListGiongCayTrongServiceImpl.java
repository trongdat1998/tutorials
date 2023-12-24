package service.iplm;

import service.GiongService;

// lớp này chứa các lớp con
public class ListGiongCayTrongServiceImpl {
    // Cà phê
    public static class CaPhe implements GiongService {

        @Override
        public String showTenGiong() {
            return "Cà phê";
        }
    }

    // Tiêu
    public static class Tieu implements GiongService {

        @Override
        public String showTenGiong() {
            return "Tiêu";
        }
    }

    // Cao Su
    public static class CaoSu implements GiongService {

        @Override
        public String showTenGiong() {
            return "Cao Su";
        }
    }


    // Cam
    public static class Cam implements GiongService {

        @Override
        public String showTenGiong() {
            return "Cam";
        }
    }

    // Nhãn
    public static class Nhan implements GiongService {

        @Override
        public String showTenGiong() {
            return "Nhãn";
        }
    }

    // Xoài
    public static class Xoai implements GiongService {

        @Override
        public String showTenGiong() {
            return "Xoài";
        }
    }

    // Sầu riêng
    public static class SauRieng implements GiongService {

        @Override
        public String showTenGiong() {
            return "Sầu Riêng";
        }
    }
}
