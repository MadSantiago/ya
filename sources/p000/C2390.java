package p000;

import android.os.Bundle;

/* JADX INFO: renamed from: ۥۜؖؕ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2390 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f7919;

    /* JADX INFO: renamed from: ۥُ */
    public final Bundle f7920;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f7921;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f7922;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f7923;

    public C2390(long j, long j2, Bundle bundle, String str, String str2) {
        this.f7922 = str;
        this.f7921 = str2;
        this.f7920 = bundle;
        this.f7919 = j;
        this.f7923 = j2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C2390 m4471(C2679 c2679) {
        String str = c2679.f8889;
        String str2 = c2679.f8886;
        return new C2390(c2679.f8887, c2679.f8885, c2679.f8888.m9478(), str, str2);
    }

    public final String toString() {
        String string = this.f7920.toString();
        String str = this.f7921;
        int length = String.valueOf(str).length();
        String str2 = this.f7922;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return AbstractC3761.m6621(sb, ",params=", string);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C2679 m4472() {
        C5645 c5645 = new C5645(new Bundle(this.f7920));
        return new C2679(this.f7922, c5645, this.f7921, this.f7919, this.f7923);
    }
}
