package p000;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥٞؕۥۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1959 {

    /* JADX INFO: renamed from: ۥُ */
    public boolean f6456;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f6457;

    /* JADX INFO: renamed from: ۥۜ */
    public int f6459;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f6460;

    /* JADX INFO: renamed from: ۦٛ */
    public final /* synthetic */ C0992 f6462;

    /* JADX INFO: renamed from: ۦۙ */
    public C1405 f6463;

    /* JADX INFO: renamed from: ۥۗ */
    public final long[] f6458 = new long[2];

    /* JADX INFO: renamed from: ۥؗ */
    public final ArrayList f6455 = new ArrayList(2);

    /* JADX INFO: renamed from: ۦؑ */
    public final ArrayList f6461 = new ArrayList(2);

    public C1959(C0992 c0992, String str) {
        this.f6462 = c0992;
        this.f6460 = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.f6455.add(this.f6462.f3535.m8573(sb.toString()));
            sb.append(".tmp");
            this.f6461.add(this.f6462.f3535.m8573(sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C1702 m3842() {
        if (!this.f6456 || this.f6463 != null || this.f6457) {
            return null;
        }
        ArrayList arrayList = this.f6455;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            C0992 c0992 = this.f6462;
            if (i >= size) {
                this.f6459++;
                return new C1702(c0992, this);
            }
            if (!c0992.f3532.m3319((C5051) arrayList.get(i))) {
                try {
                    c0992.m2118(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
