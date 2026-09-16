package p000;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: renamed from: ۥؙؕٚۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0734 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Rect[][] f2672;

    /* JADX INFO: renamed from: ۥۗ */
    public C5364[] f2673;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2639 f2674;

    /* JADX INFO: renamed from: ۦؑ */
    public final Rect[][] f2675;

    public AbstractC0734(C2639 c2639) {
        this.f2672 = new Rect[10][];
        this.f2675 = new Rect[10][];
        this.f2674 = c2639;
        mo1614(c2639);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void mo1614(C2639 c2639) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listMo2739 = c2639.f8768.mo2739(i);
            int iM7160 = AbstractC4009.m7160(i);
            this.f2672[iM7160] = (Rect[]) listMo2739.toArray(new Rect[listMo2739.size()]);
            if (i != 8) {
                List<Rect> listMo2753 = c2639.f8768.mo2753(i);
                this.f2675[iM7160] = (Rect[]) listMo2753.toArray(new Rect[listMo2753.size()]);
            }
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public abstract void mo1616(C5364 c5364);

    /* JADX INFO: renamed from: ۥۗ */
    public abstract C2639 mo1617();

    /* JADX INFO: renamed from: ۥۜ */
    public abstract void mo1618(C5364 c5364);

    /* JADX INFO: renamed from: ۥۣ */
    public final void m1619() {
        C5364[] c5364Arr = this.f2673;
        if (c5364Arr != null) {
            C5364 c5364Mo2752 = c5364Arr[0];
            C5364 c5364Mo2753 = c5364Arr[1];
            C2639 c2639 = this.f2674;
            if (c5364Mo2753 == null) {
                c5364Mo2753 = c2639.f8768.mo2752(2);
            }
            if (c5364Mo2752 == null) {
                c5364Mo2752 = c2639.f8768.mo2752(1);
            }
            mo1618(C5364.m9016(c5364Mo2752, c5364Mo2753));
            C5364 c5364 = this.f2673[AbstractC4009.m7160(16)];
            if (c5364 != null) {
                mo1622(c5364);
            }
            C5364 c5365 = this.f2673[AbstractC4009.m7160(32)];
            if (c5365 != null) {
                mo1615(c5365);
            }
            C5364 c5366 = this.f2673[AbstractC4009.m7160(64)];
            if (c5366 != null) {
                mo1621(c5366);
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void mo1620(int i, C5364 c5364) {
        if (this.f2673 == null) {
            this.f2673 = new C5364[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f2673[AbstractC4009.m7160(i2)] = c5364;
            }
        }
    }

    public AbstractC0734() {
        this(new C2639((C2639) null));
    }

    /* JADX INFO: renamed from: ۥُ */
    public void mo1615(C5364 c5364) {
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void mo1621(C5364 c5364) {
    }

    /* JADX INFO: renamed from: ۦۙ */
    public void mo1622(C5364 c5364) {
    }
}
