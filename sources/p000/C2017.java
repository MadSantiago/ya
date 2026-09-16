package p000;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: renamed from: ۥُٟؖؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2017 extends TextPaint {

    /* JADX INFO: renamed from: ۥؗ */
    public int f6645;

    /* JADX INFO: renamed from: ۥُ */
    public C1327 f6646;

    /* JADX INFO: renamed from: ۥّ */
    public AbstractC0548 f6647;

    /* JADX INFO: renamed from: ۥۗ */
    public C1690 f6648;

    /* JADX INFO: renamed from: ۥۜ */
    public C3291 f6649;

    /* JADX INFO: renamed from: ۥۣ */
    public C0376 f6650;

    /* JADX INFO: renamed from: ۦؑ */
    public C5906 f6651;

    /* JADX INFO: renamed from: ۦٛ */
    public AbstractC0213 f6652;

    /* JADX INFO: renamed from: ۦۙ */
    public C5704 f6653;

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX INFO: renamed from: ۥؗ */
    public final void m3934(AbstractC0548 abstractC0548, long j, float f) {
        if (abstractC0548 == null) {
            this.f6653 = null;
            this.f6647 = null;
            this.f6649 = null;
            setShader(null);
            return;
        }
        if (abstractC0548 instanceof C0547) {
            m3939(AbstractC3925.m7025(f, ((C0547) abstractC0548).f1966));
            return;
        }
        if (!(abstractC0548 instanceof C0714)) {
            C1078.m2275();
            return;
        }
        if (AbstractC3831.m6874(this.f6647, abstractC0548)) {
            C3291 c3291 = this.f6649;
            if (!(c3291 == null ? false : C3291.m6053(c3291.f11025, j))) {
                if (j != 9205357640488583168L) {
                    this.f6647 = abstractC0548;
                    this.f6649 = new C3291(j);
                    this.f6653 = AbstractC3004.m5600(new C0101(abstractC0548, j));
                }
            }
        } else if (j != 9205357640488583168L) {
            this.f6647 = abstractC0548;
            this.f6649 = new C3291(j);
            this.f6653 = AbstractC3004.m5600(new C0101(abstractC0548, j));
        }
        C0376 c0376M3938 = m3938();
        C5704 c5704 = this.f6653;
        c0376M3938.m815(c5704 != null ? (Shader) c5704.getValue() : null);
        this.f6646 = null;
        C5063.m8628(this, f);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m3935(AbstractC0213 abstractC0213) {
        if (abstractC0213 == null || AbstractC3831.m6874(this.f6652, abstractC0213)) {
            return;
        }
        this.f6652 = abstractC0213;
        if (abstractC0213.equals(C1548.f5235)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(abstractC0213 instanceof C3579)) {
            C1078.m2275();
            return;
        }
        m3938().m819(1);
        C3579 c3579 = (C3579) abstractC0213;
        m3938().m814(c3579.f11906);
        C0376 c0376M3938 = m3938();
        ((Paint) c0376M3938.f1400).setStrokeMiter(c3579.f11905);
        m3938().m813(c3579.f11907);
        m3938().m817(c3579.f11904);
        ((Paint) m3938().f1400).setPathEffect(null);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m3936(C5906 c5906) {
        if (c5906 == null || AbstractC3831.m6874(this.f6651, c5906)) {
            return;
        }
        this.f6651 = c5906;
        if (c5906.equals(C5906.f19486)) {
            clearShadowLayer();
            return;
        }
        C5906 c5907 = this.f6651;
        float f = c5907.f19487;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (c5907.f19488 >> 32)), Float.intBitsToFloat((int) (this.f6651.f19488 & 4294967295L)), AbstractC4225.m7470(this.f6651.f19489));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m3937(int i) {
        if (i == this.f6645) {
            return;
        }
        m3938().m808(i);
        this.f6645 = i;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C0376 m3938() {
        C0376 c0376 = this.f6650;
        if (c0376 != null) {
            return c0376;
        }
        C0376 c0377 = new C0376(this);
        this.f6650 = c0377;
        return c0377;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m3939(long j) {
        C1327 c1327 = this.f6646;
        if ((c1327 == null ? false : C4462.m7744(c1327.f4595, j)) || j == 16) {
            return;
        }
        this.f6646 = new C1327(j);
        setColor(AbstractC4225.m7470(j));
        this.f6653 = null;
        this.f6647 = null;
        this.f6649 = null;
        setShader(null);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m3940(C1690 c1690) {
        if (c1690 == null || AbstractC3831.m6874(this.f6648, c1690)) {
            return;
        }
        this.f6648 = c1690;
        int i = c1690.f5637;
        setUnderlineText((i | 1) == i);
        int i2 = this.f6648.f5637;
        setStrikeThruText((i2 | 2) == i2);
    }
}
