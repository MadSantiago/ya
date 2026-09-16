package p000;

import android.os.Bundle;

/* JADX INFO: renamed from: ۦَؗٗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3867 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Bundle f12899;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ long f12900;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ long f12901;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ boolean f12902;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C5235 f12903;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ boolean f12904;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ boolean f12905;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ String f12906;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ String f12907;

    public RunnableC3867(C5235 c5235, String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.f12907 = str;
        this.f12906 = str2;
        this.f12900 = j;
        this.f12901 = j2;
        this.f12899 = bundle;
        this.f12902 = z;
        this.f12904 = z2;
        this.f12905 = z3;
        this.f12903 = c5235;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12903.m8865(this.f12907, this.f12906, this.f12900, this.f12901, this.f12899, this.f12902, this.f12904, this.f12905);
    }
}
