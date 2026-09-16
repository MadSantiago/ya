package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: ۥؘؑٙۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class HandlerC0645 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0645(Looper looper, int i) {
        super(looper);
        switch (i) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                super(looper);
                Looper.getMainLooper();
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
