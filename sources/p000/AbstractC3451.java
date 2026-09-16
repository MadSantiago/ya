package p000;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: ۦؙؗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3451 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final float f11462 = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5468 m6228(C5362 c5362) {
        InterfaceC2880 interfaceC2880 = (InterfaceC2880) c5362.m8997(AbstractC2853.f9544);
        boolean zM8956 = c5362.m8956(interfaceC2880.mo746());
        Object objM8999 = c5362.m8999();
        if (zM8956 || objM8999 == C2850.f9517) {
            objM8999 = new C5468(new C3121(interfaceC2880));
            c5362.m8987(objM8999);
        }
        return (C5468) objM8999;
    }
}
