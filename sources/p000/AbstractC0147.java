package p000;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: renamed from: ۥؐؗ٘ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0147 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0178 f583 = C0373.f1373;

    /* JADX INFO: renamed from: ۥۣ */
    public static final boolean m321(C5639 c5639) {
        MotionEvent motionEventM9476;
        List list = c5639.f18583;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C3536) list.get(i)).f11737 != 2) {
                MotionEvent motionEventM9477 = c5639.m9476();
                if ((motionEventM9477 == null || !motionEventM9477.isFromSource(8194)) && ((motionEventM9476 = c5639.m9476()) == null || !motionEventM9476.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
