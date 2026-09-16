package p000;

import android.content.Context;
import android.view.GestureDetector;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥٜۣؔؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1829 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f6061;

    /* JADX INFO: renamed from: ۥۗ */
    public int f6062;

    /* JADX INFO: renamed from: ۥۣ */
    public boolean f6063;

    /* JADX INFO: renamed from: ۦؑ */
    public Object f6064;

    public C1829(Context context, C1264 c1264) {
        this.f6061 = c1264;
        this.f6062 = 0;
        this.f6064 = new GestureDetector(context, new GestureDetectorOnGestureListenerC3293(this));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m3601(C1489 c1489, AbstractC1112 abstractC1112) {
        C2658 c2658 = (C2658) c1489.f5058;
        int iM3111 = c1489.m3111();
        c1489.m3155(abstractC1112);
        if (((ArrayList) this.f6064) != null) {
            StringBuilder sb = c2658.f8818;
            int length = sb.length();
            boolean z = length > 0 && '\n' != sb.charAt(length - 1);
            if (z) {
                c2658.m4967('\n');
            }
            c2658.m4967((char) 160);
            C4965 c4965 = new C4965((C2268) this.f6061, (ArrayList) this.f6064, this.f6063, this.f6062 % 2 == 1);
            this.f6062 = this.f6063 ? 0 : this.f6062 + 1;
            if (z) {
                iM3111++;
            }
            c1489.m3171(iM3111, c4965);
            this.f6064 = null;
        }
    }

    public C1829(C1039 c1039, boolean z) {
        C2412 c2412 = C2412.f8031;
        this.f6064 = c1039;
        this.f6063 = z;
        this.f6061 = c2412;
        this.f6062 = Integer.MAX_VALUE;
    }

    public C1829(C2268 c2268) {
        this.f6061 = c2268;
    }
}
