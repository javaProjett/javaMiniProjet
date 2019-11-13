package Model;

import javafx.scene.image.ImageView;

public class Briques {
        public final static String laBrick = "Asset/Images/sprites/brick.png";

        private int pv;
        private ImageView skin;
        private boolean isDead;
        private boolean hasWeapon;

        public Briques(String skin, boolean hasWeapon, int velocity) {
            this.pv = 1;
            this.skin = new ImageView(skin);

            this.isDead = false;
            this.hasWeapon = hasWeapon;
        }


        public void loosePv() {
            pv -= 1;
        }

        public ImageView getSkin() {
            return skin;
        }

        public void setSkin(ImageView skin) {
            this.skin = skin;
        }

        public boolean isDead() {
            return isDead;
        }

        public void setDead() {
            isDead = true;
        }

        public boolean isHasWeapon() {
            return hasWeapon;
        }
    }
