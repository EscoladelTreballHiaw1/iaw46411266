/*
 * Program.java        2016
 * 
 * Modelizes the program.
 * 
 * Copyright 2016 <soniafandos@hotmail.com>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Bicycle {
    /** The bicycle's model */
    private String model;
    /** The engaged front sprocket */
    private int frontSprocket;
    /** The engaged rear sprocket */
    private int rearSprocket;
    /** The number of front sprockets the bicycle has */
    private final int nFrontSprockets;
    /** The number of rear sprockets the bicycle has */
    private final int nRearSprockets;
    /** The bicycle's speed in km/h */
    private double v;
    /** The maximum speed of the bicycle */
    private final static int VMAX = 100;
    /** Increment of the bicycle speed */
    private final static int DV = 5;

    /* Constructors
     *
     * Constructor by default.
     *   
     */
    public Bicycle() {
        this.model = "Mountain bike";
        this.frontSprocket = 3;
        this.rearSprocket = 3;
        this.nFrontSprockets = 3;
        this.nRearSprockets = 7;
        this.v = 0;
    }
    
    /**
     * Constructor.
     * 
     * @param nFrontSprockets the number of front sprockets.
     * @param nRearSprockets the number of rear sprockets.
     * @param v the velocity of the bicycle
     */
    public Bicycle(int nFrontSprockets, int nRearSprockets, double v) {
        this.model = "Mountain bike";
        this.nFrontSprockets = nFrontSprockets;
        // Impedim que el número de pinyons sigui inferior a 3, en aquest cas hi coloquem 3.
        if (nRearSprockets < 3) {
            this.nRearSprockets = 3;
        } else {
            this.nRearSprockets = nRearSprockets;
        }
        // Impedim que el plat en el que ens trobem sigui neagtiu, en aquest cas el coloquem en el primer plat
        if (frontSprocket <= 0) {
            this.frontSprocket = 1;
        // Si el plat en el que es vol ficar és superior al número de plats ens posem a l'ultim
        } else if (frontSprocket > nFrontSprockets) {
            this.frontSprocket = nFrontSprockets;
        // Si és una bona opció deixem el que vol l'usuari
        } else {
            this.frontSprocket = nFrontSprockets;
        }
        this.rearSprocket = 3;
        this.v = v;
    }
    
    /**
     * Constructor
     * 
     * @param model the model of the bicycle
     * @param frontSprocket the front sprocket that we are using
     * @param rearSprocket the rear sprocket that we are using
     * @param nFrontSprockets number of front sprockets
     * @param nRearSprocket number of rear sprockets
     * @param v velocity of the bike
     */
    public Bicycle(String model, int frontSprocket, int rearSprocket, int nFrontSprockets, int nRearSprockets, double v) {
        this.model = model;
        this.nFrontSprockets = nFrontSprockets;
        System.out.println("nFrontSprockets: " + nFrontSprockets);
        System.out.println("nRearSprockets: " + nRearSprockets);
        System.out.println("frontSprocket: " + frontSprocket);
        System.out.println("rearSprocket: " + rearSprocket);
        // Impedim que el número de pinyons sigui inferior a 3, en aquest cas hi coloquem 3.
        if (nRearSprockets < 3) {
            this.nRearSprockets = 3;
        } else {            
            this.nRearSprockets = nRearSprockets;
        }
        
        // Impedim que el plat en el que ens trobem sigui neagtiu, en aquest cas el coloquem en el primer plat
        if (frontSprocket <= 0) {
            this.frontSprocket = 1;
        // Si el plat en el que es vol ficar és superior al número de plats ens posem a l'ultim
        } else if (frontSprocket > nFrontSprockets) {
            this.frontSprocket = this.nFrontSprockets;
        // Si és una bona opció deixem el que vol l'usuari
        } else {
            this.frontSprocket = frontSprocket;
        }
        
        // Impedim que el pinyo en el que ens trobem sigui neagtiu, en aquest cas el coloquem en el primer plat
        if (rearSprocket <= 0) {
            this.rearSprocket = 1;
        // Si el plat en el que es vol ficar és superior al número de plats ens posem a l'ultim
        } else if (rearSprocket > this.nRearSprockets) {
            this.rearSprocket = this.nRearSprockets;
        // Si és una bona opció deixem el que vol l'usuari
        } else {
            this.rearSprocket = rearSprocket;
        }
        this.v = v;
        System.out.println("nFrontSprockets: " + this.nFrontSprockets);
        System.out.println("nRearSprockets: " + this.nRearSprockets);
        System.out.println("frontSprocket: " + this.frontSprocket);
        System.out.println("rearSprocket: " + this.rearSprocket);
        
    }
    
    // Setter and getters
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model.trim();
    }
    
    public int getRearSprocket() {
        return rearSprocket;
    }
    
    public void setRearSprocket(int rearSprocket) {
        System.out.println(rearSprocket);
        System.out.println(this.nRearSprockets);
        System.out.println(this.rearSprocket);
        
        // Impedim que el pinyo en el que ens trobem sigui neagtiu, en aquest cas el coloquem en el primer plat
        if (rearSprocket <= 0) {
            this.rearSprocket = 1;
        // Si el pinyo en el que es vol ficar és superior al número de plats ens posem a l'ultim
        } else if (rearSprocket > this.nRearSprockets) {
            this.rearSprocket = nRearSprockets;
        // Si és una bona opció deixem el que vol l'usuari
        } else {
            this.rearSprocket = nRearSprockets;
        }
    }
    
    public int getFrontSprocket() {
        return frontSprocket;
    }
    
    public void setFrontSprocket(int frontSprocket) {
        // Impedim que el plat en el que ens trobem sigui neagtiu, en aquest cas el coloquem en el primer plat
        if (frontSprocket <= 0) {
            this.frontSprocket = 1;
        // Si el plat en el que es vol ficar és superior al número de plats ens posem a l'ultim
        } else if (frontSprocket > nFrontSprockets) {
            this.frontSprocket = nFrontSprockets;
        // Si és una bona opció deixem el que vol l'usuari
        } else {
            this.frontSprocket = nFrontSprockets;
        }
    }
    
    /**
     * Method that shows the velocity of the bike
     * 
     * @return v the velocity
     */
    public double getV() {
        return v;
    }
    
    /**
     * Method that changes the velocity of the bike
     * 
     * @param v the new velocity
     */
    public void setV(double v) {
        this.v = v;
    }
    
    /**
     * Method that accelerates the velocity of the bicycle 5km/h
     */
    public void accelerate() {
        if (v + Bicycle.DV <= Bicycle.VMAX) {
            this.v = v + this.DV;
        }
    }
    
    /**
     * Method that brakes the velocity of the bicycle 5km/h
     */
    public void brake() {
        if ( v - this.DV >= 0) {
            this.v = v - this.DV;
        }
    }
    
    /**
     * Method for see if we have changed the front sprocket.
     * 
     * @param n the front number that we want
     * @return true if it has changed, false otherwise
     */
    public boolean changeFrontSprocket(int n) {
        boolean isChanged = true;
        if (this.frontSprocket < this.nFrontSprockets && n > 0 && this.v > 0) {
            this.frontSprocket++;
        } else if (this.frontSprocket > 1 && n < 0 && this.v > 0) {
            this.frontSprocket--;
        } else {
            isChanged = false;
        }
        return isChanged;
    }
    
    /**
     * Method for see if we have changed the rear sprocket.
     * 
     * @param n the rear number that we want
     * @return true if it has changed, false otherwise
     */
    public boolean changeRearSprocket(int num) {
        boolean isChanged = true;
        if (rearSprocket < nRearSprockets && num > 0 && v > 0) {
            rearSprocket++;
        } else if (rearSprocket > 1 && num < 0 && v > 0) {
            rearSprocket--;
        } else {
            isChanged = false;
        }
        return isChanged;
    }
    
    /**
     * Method that stop the bicycle. v = 0
     */
    public void stop() {
        this.v = 0;
    }
    
    /**
     * Metode que permet reduir la marxa. 
     * 
     * @return true si s'ha pogut fer el canvi de marxa, false altrament
     */
    public boolean slowDown() {
        boolean hasChanged = false;
        // Quan estem al plat(FRONT) més petit, anem augmentant el pinyó(REAR) fins al més gran
        if (this.frontSprocket == 1) {
           
            if (this.rearSprocket + 1 == nRearSprockets) {
                this.rearSprocket++;
                this.frontSprocket--;
                hasChanged = true;
            } else if (this.rearSprocket != nRearSprockets) {
                this.rearSprocket++;
                hasChanged = true;
            }
        // Si no és el plat més petit només permet arribar fins al segon pinyo més gran
        } else {
            if (this.rearSprocket + 1 == nRearSprockets) {
                this.rearSprocket++;
                this.frontSprocket--;
                hasChanged = true;
            } else if (this.rearSprocket > 0 && this.rearSprocket < nRearSprockets) {
                this.rearSprocket++;
                hasChanged = true;
            }
        }
        return hasChanged;
    }
    
     /**
     * Metode que permet augmentar la marxa. 
     * 
     * @return true si s'ha pogut fer el canvi de marxa, false altrament
     */
     public boolean speedUp() {
        boolean hasChanged = false;
        // Quan estem al plat(FRONT) més gran, anem disminuint el pinyó(REAR) fins al més petit
        if (this.frontSprocket == this.nFrontSprockets) {
           
            if (this.rearSprocket == 2) {
                this.rearSprocket--;
                this.frontSprocket++;
                hasChanged = true;
            } else if (this.rearSprocket <= this.nRearSprockets && this.rearSprocket > 2) {
                this.rearSprocket--;
                hasChanged = true;
            }
        // Si no és el plat més gran només permet arribar fins al segon pinyo més petit
        } else {
            if (this.rearSprocket == 2) {
                this.rearSprocket--;
                this.frontSprocket++;
                hasChanged = true;
            } else if (this.rearSprocket > 2 && this.rearSprocket < nRearSprockets) {
                this.rearSprocket--;
                hasChanged = true;
            }
        }
        return hasChanged;
    }

        
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    