package com.company;

public class Event {


        public final static int PRICE_PER_GUEST = 35;
        public final static int CUT_OFF = 50;

        //Attributes
        private String eventNum;
        private int noOfGuest;
        private int price;

        /**
         * @param eventNum the eventNum to set
         */
        public void setEventNum(String eventNum) {
            this.eventNum = eventNum;
        }

        /**
         * @param noOfGuest the noOfGuest to set
         */
        public void setNoOfGuest(int noOfGuest) {
            this.noOfGuest = noOfGuest;
            this.price = this.noOfGuest * PRICE_PER_GUEST;
        }

        /**
         * @return the eventNum
         */
        public String getEventNum() {
            return eventNum;
        }

        /**
         * @return the noOfGuest
         */
        public int getNoOfGuest() {
            return noOfGuest;
        }

        /**
         * @return the price
         */
        public int getPrice() {
            return price;
        }
    }
