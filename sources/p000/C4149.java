package p000;

import android.view.MotionEvent;

/* JADX INFO: renamed from: ۦٓ۟ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4149 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4149 f13807 = new C4149();

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m7328(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040;
    }
}
