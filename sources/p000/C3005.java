package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦؘٟؐؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3005 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f10104;

    /* JADX INFO: renamed from: ۥُ */
    public final float f10105;

    /* JADX INFO: renamed from: ۥّ */
    public final float f10106;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f10107;

    /* JADX INFO: renamed from: ۥۜ */
    public final float f10108;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f10109;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f10110;

    /* JADX INFO: renamed from: ۦِ */
    public final ArrayList f10111;

    /* JADX INFO: renamed from: ۦٛ */
    public final List f10112;

    /* JADX INFO: renamed from: ۦۙ */
    public final float f10113;

    public C3005(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        if ((i & 256) != 0) {
            int i2 = AbstractC0184.f672;
            list = C2340.f7777;
        }
        ArrayList arrayList = new ArrayList();
        this.f10109 = str;
        this.f10107 = f;
        this.f10104 = f2;
        this.f10110 = f3;
        this.f10105 = f4;
        this.f10106 = f5;
        this.f10113 = f6;
        this.f10108 = f7;
        this.f10112 = list;
        this.f10111 = arrayList;
    }
}
