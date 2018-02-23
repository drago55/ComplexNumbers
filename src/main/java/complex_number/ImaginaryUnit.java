package complex_number;

public enum ImaginaryUnit {
        I("i"),  J("j");
        private String unit;
        ImaginaryUnit(String unit){
            this.unit=unit;
        }
        public String getValue(){
            return this.unit;
        }

}
