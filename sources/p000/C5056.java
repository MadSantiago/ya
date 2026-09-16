package p000;

import android.net.Uri;

/* JADX INFO: renamed from: ۦؚۘؗ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5056 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f16786;

    /* JADX INFO: renamed from: ۥُ */
    public final String f16787;

    /* JADX INFO: renamed from: ۥّ */
    public final int f16788;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f16789;

    /* JADX INFO: renamed from: ۥۣ */
    public final Uri f16790;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f16791;

    public C5056(String str, String str2) {
        this.f16790 = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f16789 = 0;
        this.f16786 = 400;
        this.f16791 = false;
        this.f16787 = str2;
        this.f16788 = 0;
    }

    public C5056(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.f16790 = uri;
        this.f16789 = i;
        this.f16786 = i2;
        this.f16791 = z;
        this.f16787 = str;
        this.f16788 = i3;
    }
}
