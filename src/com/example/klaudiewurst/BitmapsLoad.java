package com.example.klaudiewurst;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.view.SurfaceView;

public class BitmapsLoad extends SurfaceView {

	//Load movement sprites
	
	private Bitmap[] mouseRun = new Bitmap[72];
	private Bitmap[] mouseWalk = new Bitmap[72];
	private Bitmap[] mouseStands = new Bitmap[8];
	public BitmapsLoad(Context context){
		super(context);
			mouseRun[0] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run001);
			mouseRun[1] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run002);
			mouseRun[2] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run003);
			mouseRun[3] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run004);
			mouseRun[4] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run005);
			mouseRun[5] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run006);
			mouseRun[6] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run007);
			mouseRun[7] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run008);
			mouseRun[8] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run009);
			mouseRun[9] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run010);
			mouseRun[10] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run011);
			mouseRun[11] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run012);
			mouseRun[12] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run013);
			mouseRun[13] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run014);
			mouseRun[14] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run015);
			mouseRun[15] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run016);
			mouseRun[16] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run017);
			mouseRun[17] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run018);
			mouseRun[18] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run019);
			mouseRun[19] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run020);
			mouseRun[20] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run021);
			mouseRun[21] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run022);
			mouseRun[22] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run023);
			mouseRun[23] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run024);
			mouseRun[24] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run025);
			mouseRun[25] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run026);
			mouseRun[26] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run027);
			mouseRun[27] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run028);
			mouseRun[28] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run029);
			mouseRun[29] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run030);
			mouseRun[30] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run031);
			mouseRun[31] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run032);
			mouseRun[32] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run033);
			mouseRun[33] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run034);
			mouseRun[34] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run035);
			mouseRun[35] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run036);
			mouseRun[36] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run037);
			mouseRun[37] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run038);
			mouseRun[38] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run039);
			mouseRun[39] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run040);
			mouseRun[40] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run041);
			mouseRun[41] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run042);
			mouseRun[42] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run043);
			mouseRun[43] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run044);
			mouseRun[44] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run045);
			mouseRun[45] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run046);
			mouseRun[46] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run047);
			mouseRun[47] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run048);
			mouseRun[48] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run049);
			mouseRun[49] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run050);
			mouseRun[50] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run051);
			mouseRun[51] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run052);
			mouseRun[52] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run053);
			mouseRun[53] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run054);
			mouseRun[54] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run055);
			mouseRun[55] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run056);
			mouseRun[56] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run057);
			mouseRun[57] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run058);
			mouseRun[58] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run059);
			mouseRun[59] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run060);
			mouseRun[60] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run061);
			mouseRun[61] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run062);
			mouseRun[62] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run063);
			mouseRun[63] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run064);
			mouseRun[64] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run065);
			mouseRun[65] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run066);
			mouseRun[66] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run067);
			mouseRun[67] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run068);
			mouseRun[68] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run069);
			mouseRun[69] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run070);
			mouseRun[70] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run071);
			mouseRun[71] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run072);
			

			mouseWalk[0] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run001);
			mouseWalk[1] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run002);
			mouseWalk[2] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run003);
			mouseWalk[3] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run004);
			mouseWalk[4] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run005);
			mouseWalk[5] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run006);
			mouseWalk[6] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run007);
			mouseWalk[7] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run008);
			mouseWalk[8] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run009);
			mouseWalk[9] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run010);
			mouseWalk[10] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run011);
			mouseWalk[11] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run012);
			mouseWalk[12] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run013);
			mouseWalk[13] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run014);
			mouseWalk[14] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run015);
			mouseWalk[15] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run016);
			mouseWalk[16] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run017);
			mouseWalk[17] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run018);
			mouseWalk[18] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run019);
			mouseWalk[19] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run020);
			mouseWalk[20] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run021);
			mouseWalk[21] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run022);
			mouseWalk[22] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run023);
			mouseWalk[23] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run024);
			mouseWalk[24] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run025);
			mouseWalk[25] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run026);
			mouseWalk[26] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run027);
			mouseWalk[27] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run028);
			mouseWalk[28] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run029);
			mouseWalk[29] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run030);
			mouseWalk[30] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run031);
			mouseWalk[31] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run032);
			mouseWalk[32] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run033);
			mouseWalk[33] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run034);
			mouseWalk[34] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run035);
			mouseWalk[35] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run036);
			mouseWalk[36] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run037);
			mouseWalk[37] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run038);
			mouseWalk[38] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run039);
			mouseWalk[39] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run040);
			mouseWalk[40] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run041);
			mouseWalk[41] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run042);
			mouseWalk[42] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run043);
			mouseWalk[43] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run044);
			mouseWalk[44] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run045);
			mouseWalk[45] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run046);
			mouseWalk[46] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run047);
			mouseWalk[47] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run048);
			mouseWalk[48] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run049);
			mouseWalk[49] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run050);
			mouseWalk[50] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run051);
			mouseWalk[51] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run052);
			mouseWalk[52] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run053);
			mouseWalk[53] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run054);
			mouseWalk[54] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run055);
			mouseWalk[55] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run056);
			mouseWalk[56] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run057);
			mouseWalk[57] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run058);
			mouseWalk[58] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run059);
			mouseWalk[59] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run060);
			mouseWalk[60] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run061);
			mouseWalk[61] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run062);
			mouseWalk[62] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run063);
			mouseWalk[63] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run064);
			mouseWalk[64] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run065);
			mouseWalk[65] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run066);
			mouseWalk[66] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run067);
			mouseWalk[67] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run068);
			mouseWalk[68] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run069);
			mouseWalk[69] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run070);
			mouseWalk[70] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run071);
			mouseWalk[71] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_run072);
			
		
		
			mouseStands[0] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_stand001);
			mouseStands[1] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_stand002);
			mouseStands[2] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_stand003);
			mouseStands[3] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_stand004);
			mouseStands[4] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_stand005);
			mouseStands[5] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_stand006);
			mouseStands[6] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_stand007);
			mouseStands[7] = BitmapFactory.decodeResource(getResources(), R.drawable.mouse_stand008);
		
		
	}
	public Bitmap getMouseRun(int i) {
		return mouseRun[i];
	}
	public void setMouseRun(Bitmap[] mouseRun) {
		this.mouseRun = mouseRun;
	}
	public Bitmap getMouseWalk(int i) {
		return mouseWalk[i];
	}
	public void setMouseWalk(Bitmap[] mouseWalk) {
		this.mouseWalk = mouseWalk;
	}
	public Bitmap getMouseStands(int i) {
		return mouseStands[i];
	}
	public void setMouseStands(Bitmap[] mouseStands) {
		this.mouseStands = mouseStands;
	}
}
