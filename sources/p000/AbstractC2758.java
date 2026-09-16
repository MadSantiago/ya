package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥۥْٕؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2758 {

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f9135;

    /* JADX INFO: renamed from: ۦۨ */
    public int f9136;

    public AbstractC2758(C0562 c0562, int i) {
        if (c0562 == null) {
            C1078.m2272("format options cannot be null");
            throw null;
        }
        if (i < 0) {
            C1078.m2272(AbstractC5078.m8673(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
            throw null;
        }
        this.f9136 = i;
        this.f9135 = c0562;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public abstract int mo5038();

    /* JADX INFO: renamed from: ۥؖ */
    public abstract int mo5039();

    /* JADX INFO: renamed from: ۥؗ */
    public abstract boolean mo5040();

    /* JADX INFO: renamed from: ۥً */
    public abstract boolean mo5041(int i);

    /* JADX INFO: renamed from: ۥَ */
    public abstract long mo5042();

    /* JADX INFO: renamed from: ۥّ */
    public abstract C2639 mo281(C2639 c2639, List list);

    /* JADX INFO: renamed from: ۥْ */
    public abstract float mo5043();

    /* JADX INFO: renamed from: ۥٓ */
    public abstract int mo5044();

    /* JADX INFO: renamed from: ۥٕ */
    public abstract void mo3563(C3043 c3043, Object obj);

    /* JADX INFO: renamed from: ۥٖ */
    public abstract int mo5045();

    /* JADX INFO: renamed from: ۥٙ */
    public abstract String mo5046();

    /* JADX INFO: renamed from: ۥۖ */
    public abstract long mo5047();

    /* JADX INFO: renamed from: ۥۗ */
    public abstract int mo5048();

    /* JADX INFO: renamed from: ۥۜ */
    public abstract C2346 mo282(C0460 c0460, C2346 c2346);

    /* JADX INFO: renamed from: ۥۣ */
    public abstract void mo5050(int i);

    /* JADX INFO: renamed from: ۥۧ */
    public abstract long mo5052();

    /* JADX INFO: renamed from: ۦؚ */
    public abstract C0533 mo5056();

    /* JADX INFO: renamed from: ۦٌ */
    public abstract double mo5057();

    /* JADX INFO: renamed from: ۦِ */
    public abstract int mo5059(int i);

    /* JADX INFO: renamed from: ۦٕ */
    public abstract String mo5060();

    /* JADX INFO: renamed from: ۦٗ */
    public abstract long mo5062();

    /* JADX INFO: renamed from: ۦٚ */
    public void m5113() throws C3406 {
        boolean zMo5041;
        do {
            int iMo5039 = mo5039();
            if (iMo5039 == 0) {
                return;
            }
            int i = this.f9136;
            if (i >= 100) {
                throw new C3406("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f9136 = i + 1;
            zMo5041 = mo5041(iMo5039);
            this.f9136--;
        } while (zMo5041);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public abstract void mo5063(int i);

    /* JADX INFO: renamed from: ۦۗ */
    public abstract boolean mo5064();

    /* JADX INFO: renamed from: ۦۚ */
    public abstract int mo5065();

    /* JADX INFO: renamed from: ۦۛ */
    public abstract int mo5066();

    /* JADX INFO: renamed from: ۦ۟ */
    public abstract long mo5067();

    /* JADX INFO: renamed from: ۦۨ */
    public abstract int mo5068();

    /* JADX INFO: renamed from: ۥُ */
    public void mo280(C0460 c0460) {
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void mo283(C0460 c0460) {
    }

    public AbstractC2758(int i) {
        this.f9136 = i;
    }
}
