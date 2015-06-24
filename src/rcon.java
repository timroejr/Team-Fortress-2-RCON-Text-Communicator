import java.net.SocketTimeoutException;

import net.sourceforge.rconed.SourceRcon;
import net.sourceforge.rconed.exception.BadRcon;
import net.sourceforge.rconed.exception.ResponseEmpty;
public class rcon {

	public static void main(String[] args) throws SocketTimeoutException, BadRcon, ResponseEmpty {
		try {
			int local = 27015;
			String ip = ""; //REMOVED FOR PRIVACY REASONS
			String password = ""; //REMOVED FOR PRIVACY REASONS
			String exec = "exec ugc_HL_stopwatch";
			String stringShow = null;
			stringShow = SourceRcon.send(ip, local, password, exec);
			System.out.println(stringShow);
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		
	}

}
