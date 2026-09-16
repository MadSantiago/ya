package p000;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: ۦٞؗٛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4821 extends AbstractC2857 implements Set {

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ int f15885 = 0;

    /* JADX INFO: renamed from: ۦ۟ */
    public transient AbstractC4822 f15886;

    /* JADX INFO: renamed from: ۦِ */
    public static int m8195(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        C1078.m2272("collection too large");
        return 0;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static AbstractC4821 m8196(int i, Object... objArr) {
        if (i == 0) {
            return C2745.f9080;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C3537(obj);
        }
        int iM8195 = m8195(i);
        Object[] objArr2 = new Object[iM8195];
        int i2 = iM8195 - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i5);
                throw new NullPointerException(sb.toString());
            }
            int iHashCode = obj2.hashCode();
            int iM4206 = AbstractC2164.m4206(iHashCode);
            while (true) {
                int i6 = iM4206 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM4206++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C3537(obj4);
        }
        if (m8195(i4) < iM8195 / 2) {
            return m8196(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C2745(i3, i2, i4, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC4821) && (this instanceof C2745) && (((AbstractC4821) obj) instanceof C2745) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() != set.size() || !containsAll(set)) {
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC2552.m4829(this);
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۗ */
    public AbstractC4822 mo4834() {
        AbstractC4822 abstractC4822 = this.f15886;
        if (abstractC4822 != null) {
            return abstractC4822;
        }
        AbstractC4822 abstractC4822Mo1605 = mo1605();
        this.f15886 = abstractC4822Mo1605;
        return abstractC4822Mo1605;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public AbstractC4822 mo1605() {
        Object[] array = toArray(AbstractC2857.f9563);
        C1868 c1868 = AbstractC4822.f15887;
        return AbstractC4822.m8197(array.length, array);
    }
}
