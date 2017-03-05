package Telekanalid;

/*
 * Created by L1ND3 on 28.02.2017.
 */
public class PropagandaStation extends Broadcaster{
    void broadcastNow(){
        String[] announcements = {"Põhja-Korea on parim!", "Hail, North Korea!"};
        broadcast(announcements[(int) Math.round(Math.random()*(announcements.length-1))]);
    }
}
