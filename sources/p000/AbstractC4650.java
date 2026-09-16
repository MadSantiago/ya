package p000;

import java.io.InputStream;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ۦؚٖٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4650 {

    /* JADX INFO: renamed from: ۥؗ */
    public Object f15337;

    /* JADX INFO: renamed from: ۥۗ */
    public int f15338;

    /* JADX INFO: renamed from: ۥۣ */
    public int f15339;

    public AbstractC4650(DexKitBridge dexKitBridge, int i, int i2) {
        this.f15337 = dexKitBridge;
        this.f15339 = i;
        this.f15338 = i2;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static AbstractC4650 m8025(InputStream inputStream, int i) {
        if (i <= 0) {
            C1078.m2272("bufferSize must be > 0");
            return null;
        }
        if (inputStream != null) {
            return new C4812(inputStream, i);
        }
        C2464 c2464 = new C2464(AbstractC1963.f6474);
        try {
            c2464.mo4609(0);
            return c2464;
        } catch (C5463 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public static int m8026(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static long m8027(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX INFO: renamed from: ۥؓ */
    public abstract int mo4593();

    /* JADX INFO: renamed from: ۥؖ */
    public abstract byte[] mo4595();

    /* JADX INFO: renamed from: ۥؗ */
    public abstract int mo4596();

    /* JADX INFO: renamed from: ۥً */
    public abstract int mo4597();

    /* JADX INFO: renamed from: ۥَ */
    public abstract int mo4598();

    /* JADX INFO: renamed from: ۥُ */
    public abstract int mo4599();

    /* JADX INFO: renamed from: ۥّ */
    public abstract int mo4600(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ۥْ */
    public abstract long mo4601();

    /* JADX INFO: renamed from: ۥٓ */
    public abstract long mo4602();

    /* JADX INFO: renamed from: ۥٕ */
    public abstract int mo4603();

    /* JADX INFO: renamed from: ۥٖ */
    public abstract long mo4604();

    /* JADX INFO: renamed from: ۥٙ */
    public abstract C4585 mo4605();

    /* JADX INFO: renamed from: ۥۖ */
    public abstract String mo4606();

    /* JADX INFO: renamed from: ۥۗ */
    public abstract void mo4607(int i);

    /* JADX INFO: renamed from: ۥۙ */
    public abstract long mo4608();

    /* JADX INFO: renamed from: ۥۣ */
    public abstract int mo4609(int i);

    /* JADX INFO: renamed from: ۥۧ */
    public abstract int mo4611();

    /* JADX INFO: renamed from: ۦؑ */
    public abstract boolean mo4612();

    /* JADX INFO: renamed from: ۦؖ */
    public abstract long mo4613();

    /* JADX INFO: renamed from: ۦؙ */
    public abstract int mo4615();

    /* JADX INFO: renamed from: ۦؚ */
    public abstract int mo4616();

    /* JADX INFO: renamed from: ۦٌ */
    public abstract void mo4617(int i);

    /* JADX INFO: renamed from: ۦٕ */
    public abstract String mo4619();

    /* JADX INFO: renamed from: ۦٗ */
    public abstract int mo4621();

    /* JADX INFO: renamed from: ۦٚ */
    public abstract long mo4622();

    /* JADX INFO: renamed from: ۦٛ */
    public void m8028() throws C5463 {
        boolean zMo4624;
        do {
            int iMo4616 = mo4616();
            if (iMo4616 == 0) {
                return;
            }
            int i = this.f15339;
            int i2 = this.f15338;
            if (i + i2 >= 100) {
                C2316.m4358("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.f15338 = i2 + 1;
                zMo4624 = mo4624(iMo4616);
                this.f15338--;
            }
        } while (zMo4624);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public abstract void mo4623(int i);

    /* JADX INFO: renamed from: ۦۚ */
    public abstract boolean mo4624(int i);

    /* JADX INFO: renamed from: ۦۛ */
    public abstract boolean mo4625();

    /* JADX INFO: renamed from: ۦ۟ */
    public abstract float mo4626();

    /* JADX INFO: renamed from: ۦۨ */
    public abstract double mo4627();
}
