package p000;

import android.os.Build;

/* JADX INFO: renamed from: ۥِؔۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1105 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1105 f3889 = new C1105();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f3888 = C5802.m9613("packageName");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f3885 = C5802.m9613("versionName");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f3890 = C5802.m9613("appBuildVersion");

    /* JADX INFO: renamed from: ۥُ */
    public static final C5802 f3886 = C5802.m9613("deviceManufacturer");

    /* JADX INFO: renamed from: ۥّ */
    public static final C5802 f3887 = C5802.m9613("currentProcessDetails");

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5802 f3891 = C5802.m9613("appProcessDetails");

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        C1045 c1045 = (C1045) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6180(f3888, c1045.f3698);
        interfaceC5267.mo6180(f3885, c1045.f3697);
        interfaceC5267.mo6180(f3890, c1045.f3695);
        interfaceC5267.mo6180(f3886, Build.MANUFACTURER);
        interfaceC5267.mo6180(f3887, c1045.f3699);
        interfaceC5267.mo6180(f3891, c1045.f3696);
    }
}
