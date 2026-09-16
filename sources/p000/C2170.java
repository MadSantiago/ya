package p000;

import android.os.Build;

/* JADX INFO: renamed from: ۥۘؕۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2170 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2170 f7166 = new C2170();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f7165 = C5802.m9613("appId");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f7162 = C5802.m9613("deviceModel");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f7167 = C5802.m9613("sessionSdkVersion");

    /* JADX INFO: renamed from: ۥُ */
    public static final C5802 f7163 = C5802.m9613("osVersion");

    /* JADX INFO: renamed from: ۥّ */
    public static final C5802 f7164 = C5802.m9613("logEnvironment");

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5802 f7168 = C5802.m9613("androidAppInfo");

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        C5899 c5899 = (C5899) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6180(f7165, c5899.f19451);
        interfaceC5267.mo6180(f7162, Build.MODEL);
        interfaceC5267.mo6180(f7167, "3.0.7");
        interfaceC5267.mo6180(f7163, Build.VERSION.RELEASE);
        interfaceC5267.mo6180(f7164, EnumC5090.f16882);
        interfaceC5267.mo6180(f7168, c5899.f19450);
    }
}
