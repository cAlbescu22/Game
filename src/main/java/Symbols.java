public enum Symbols {
    SYMBOL_1_first {
        @Override
        public String toString() {

            return isDiscovered() ? "!" : "O";
        }
    },

    SYMBOL_1_second{
        @Override
        public String toString() {

            return isDiscovered() ? "!" : "O";
        }
    },

    SYMBOL_2_first{
        @Override
        public String toString() {

            return isDiscovered() ? "@" : "O";
        }
    },
    SYMBOL_2_second {
        @Override
        public String toString() {

            return isDiscovered() ? "@" : "O";
        }
    },
    SYMBOL_3_second {
        @Override
        public String toString() {
            return isDiscovered() ? "#" : "O";
        }
    },
    SYMBOL_3_first {
        @Override
        public String toString() {
            return isDiscovered() ? "#" : "O";
        }
    },
    SYMBOL_4_first {
        @Override
        public String toString() {
            return isDiscovered() ? "$" : "O";
        }
    },
    SYMBOL_4_second {
        @Override
        public String toString() {
            return isDiscovered() ? "$" : "O";
        }
    },
    SYMBOL_5_first {
        @Override
        public String toString() {
            return isDiscovered() ? "%" : "O";
        }
    },
    SYMBOL_5_second {
        @Override
        public String toString() {
            return isDiscovered() ? "%" : "O";
        }
    },
    SYMBOL_6_first {
        @Override
        public String toString() {
            return isDiscovered() ? "^" : "O";
        }
    },
    SYMBOL_6_second {
        @Override
        public String toString() {
            return isDiscovered() ? "^" : "O";
        }
    },
    SYMBOL_7_first {
        @Override
        public String toString() {
            return isDiscovered() ? "&" : "O";
        }
    },
    SYMBOL_7_second {
        @Override
        public String toString() {
            return isDiscovered() ? "&" : "O";
        }
    },
    SYMBOL_8_first {
        @Override
        public String toString() {
            return isDiscovered() ? "*" : "O";
        }
    },
    SYMBOL_8_second {
        @Override
        public String toString() {
            return isDiscovered() ? "*" : "O";
        }
    },
    SYMBOL_EMPTY;

    private boolean discovered;

    private Symbols() {
        discovered = false;
    }


    public void discover() {
        discovered = true;
    }

    public boolean isDiscovered() {
        return discovered;
    }
    public void hidden(){
        discovered=false;
    }


}

