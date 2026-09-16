package p000;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;

/* JADX INFO: renamed from: ۥۖؓٞ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2054 implements Runnable {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6769;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ RunnableC2054 f6768 = new RunnableC2054(0);

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ RunnableC2054 f6767 = new RunnableC2054(3);

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.f6769) {
            case 0:
            case 1:
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i = runningAppProcessInfo.importance;
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 17);
                    sb.append("Memory state is: ");
                    sb.append(i);
                    Log.i("PhenotypeProcessReaper", sb.toString());
                    z = runningAppProcessInfo.importance >= 400;
                } catch (RuntimeException e) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                }
                if (new Boolean(z).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC2054(int i) {
        this.f6769 = i;
    }

    public RunnableC2054(C3121 c3121, int i) {
        this.f6769 = 1;
    }

    /* JADX INFO: renamed from: ۥؗ */
    private final void m4004() {
    }

    /* JADX INFO: renamed from: ۥۗ */
    private final void m4005() {
    }

    /* JADX INFO: renamed from: ۥۣ */
    private final void m4006() {
    }

    /* JADX INFO: renamed from: ۦؑ */
    private final /* synthetic */ void m4007() {
    }
}
