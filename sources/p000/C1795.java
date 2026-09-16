package p000;

import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥٛؗۦۣ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1795 {

    /* JADX INFO: renamed from: ۥؗ */
    public volatile Object f5992;

    /* JADX INFO: renamed from: ۥۗ */
    public volatile Object f5993;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f5994;

    public C1795(C1510 c1510) {
        C5643 c5643 = new C5643();
        C4575 c4575 = new C4575(2);
        this.f5992 = c5643;
        this.f5994 = new ArrayList();
        this.f5993 = c4575;
        c1510.m3185(new C1898(this));
    }

    public C1795(Looper looper, Object obj, String str) {
        this.f5994 = new ExecutorC0170(looper);
        this.f5993 = obj;
        AbstractC0487.m1090(str);
        this.f5992 = new C0488(obj, str);
    }
}
