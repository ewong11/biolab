public class Crush extends NPC {
        public String friendLev() {
	if (friendship == 0)
	    return "stranger";
	else if (friendship == 1)
	    return "acquaintance";
	else if (friendship == 2)
	    return "close friend";
	else if (friendship == 3)
	    return "best fwend";
	else
	    return "lovebwds"; 
    } 
} 
