package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥۧؔۗ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2868 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final /* synthetic */ long f9583 = AbstractC3456.f11473.objectFieldOffset(AbstractC2868.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: ۥۣ */
    public AbstractRunnableC1169[] f9584;

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractRunnableC1169 m5433(int i) {
        Object[] objArr = this.f9584;
        AbstractC3456.f11473.putIntVolatile(this, f9583, m5434() - 1);
        if (i < m5434()) {
            m5436(i, m5434());
            int i2 = (i - 1) / 2;
            if (i <= 0 || objArr[i].compareTo(objArr[i2]) >= 0) {
                while (true) {
                    int i3 = i * 2;
                    int i4 = i3 + 1;
                    if (i4 >= m5434()) {
                        break;
                    }
                    Object[] objArr2 = this.f9584;
                    int i5 = i3 + 2;
                    if (i5 >= m5434() || objArr2[i5].compareTo(objArr2[i4]) >= 0) {
                        i5 = i4;
                    }
                    if (objArr2[i].compareTo(objArr2[i5]) <= 0) {
                        break;
                    }
                    m5436(i, i5);
                    i = i5;
                }
            } else {
                m5436(i, i2);
                while (i2 > 0) {
                    Object[] objArr3 = this.f9584;
                    int i6 = (i2 - 1) / 2;
                    if (objArr3[i6].compareTo(objArr3[i2]) <= 0) {
                        break;
                    }
                    m5436(i2, i6);
                    i2 = i6;
                }
            }
        }
        AbstractRunnableC1169 abstractRunnableC1169 = objArr[m5434()];
        abstractRunnableC1169.m2493(null);
        abstractRunnableC1169.f4055 = -1;
        objArr[m5434()] = null;
        return abstractRunnableC1169;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m5434() {
        return AbstractC3456.f11473.getIntVolatile(this, f9583);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m5435(AbstractRunnableC1169 abstractRunnableC1169) {
        abstractRunnableC1169.m2493((C4041) this);
        AbstractRunnableC1169[] abstractRunnableC1169Arr = this.f9584;
        if (abstractRunnableC1169Arr == null) {
            abstractRunnableC1169Arr = new AbstractRunnableC1169[4];
            this.f9584 = abstractRunnableC1169Arr;
        } else if (m5434() >= abstractRunnableC1169Arr.length) {
            abstractRunnableC1169Arr = (AbstractRunnableC1169[]) Arrays.copyOf(abstractRunnableC1169Arr, m5434() * 2);
            this.f9584 = abstractRunnableC1169Arr;
        }
        int iM5434 = m5434();
        AbstractC3456.f11473.putIntVolatile(this, f9583, iM5434 + 1);
        abstractRunnableC1169Arr[iM5434] = abstractRunnableC1169;
        abstractRunnableC1169.f4055 = iM5434;
        while (iM5434 > 0) {
            Object[] objArr = this.f9584;
            int i = (iM5434 - 1) / 2;
            if (objArr[i].compareTo(objArr[iM5434]) <= 0) {
                return;
            }
            m5436(iM5434, i);
            iM5434 = i;
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m5436(int i, int i2) {
        AbstractRunnableC1169[] abstractRunnableC1169Arr = this.f9584;
        AbstractRunnableC1169 abstractRunnableC1169 = abstractRunnableC1169Arr[i2];
        AbstractRunnableC1169 abstractRunnableC11610 = abstractRunnableC1169Arr[i];
        abstractRunnableC1169Arr[i] = abstractRunnableC1169;
        abstractRunnableC1169Arr[i2] = abstractRunnableC11610;
        abstractRunnableC1169.f4055 = i;
        abstractRunnableC11610.f4055 = i2;
    }
}
