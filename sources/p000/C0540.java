package p000;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: ۥؖؕۚؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0540 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f1935;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f1936;

    /* JADX INFO: renamed from: ۥّ */
    public final Long f1937;

    /* JADX INFO: renamed from: ۥۗ */
    public final Boolean f1938;

    /* JADX INFO: renamed from: ۥۜ */
    public final String f1939;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f1940;

    /* JADX INFO: renamed from: ۦؑ */
    public final C1302 f1941;

    /* JADX INFO: renamed from: ۦۙ */
    public final Long f1942;

    public C0540(Context context, C1302 c1302, Long l, Long l2) {
        this.f1936 = true;
        AbstractC0487.m1047(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC0487.m1047(applicationContext);
        this.f1940 = applicationContext;
        this.f1937 = l;
        this.f1942 = l2;
        if (c1302 != null) {
            this.f1941 = c1302;
            this.f1936 = c1302.f4470;
            this.f1935 = c1302.f4472;
            this.f1939 = c1302.f4469;
            Bundle bundle = c1302.f4471;
            if (bundle != null) {
                this.f1938 = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
