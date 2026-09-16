package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦۘؖۤٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5052 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final /* synthetic */ int f16768 = 0;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f16769;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1332 f16770 = C1332.m2840();

    static {
        new C5052(0);
    }

    public C5052(int i) {
        m8575();
        m8575();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m8574(C2100 c2100, EnumC1497 enumC1497, int i, Object obj) {
        if (enumC1497 == EnumC1497.f5074) {
            c2100.m4066(i, 3);
            ((AbstractC0066) obj).mo675(c2100);
            c2100.m4066(i, 4);
        }
        c2100.m4066(i, enumC1497.f5076);
        switch (enumC1497.ordinal()) {
            case 0:
                c2100.m4071(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c2100.m4055(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                c2100.m4064(((Long) obj).longValue());
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                c2100.m4064(((Long) obj).longValue());
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                c2100.m4062(((Integer) obj).intValue());
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                c2100.m4071(((Long) obj).longValue());
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                c2100.m4055(((Integer) obj).intValue());
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                c2100.m4069(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0533)) {
                    c2100.m4051((String) obj);
                } else {
                    c2100.m4057((C0533) obj);
                }
                break;
            case 9:
                ((AbstractC0066) obj).mo675(c2100);
                break;
            case 10:
                AbstractC0066 abstractC0066 = (AbstractC0066) obj;
                c2100.m4072(((AbstractC0318) abstractC0066).mo677(null));
                abstractC0066.mo675(c2100);
                break;
            case 11:
                if (!(obj instanceof C0533)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c2100.m4072(length);
                    c2100.m4074(bArr, 0, length);
                } else {
                    c2100.m4057((C0533) obj);
                }
                break;
            case 12:
                c2100.m4072(((Integer) obj).intValue());
                break;
            case 13:
                c2100.m4062(((Integer) obj).intValue());
                break;
            case 14:
                c2100.m4055(((Integer) obj).intValue());
                break;
            case 15:
                c2100.m4071(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c2100.m4072((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c2100.m4064((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final Object clone() {
        C5052 c5052 = new C5052();
        C1332 c1332 = this.f16770;
        if (c1332.f4612.size() > 0) {
            Map.Entry entryM2841 = c1332.m2841(0);
            if (entryM2841.getKey() != null) {
                C0178.m382();
                return null;
            }
            entryM2841.getValue();
            throw null;
        }
        Iterator it = c1332.m2846().iterator();
        if (!it.hasNext()) {
            return c5052;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            C0178.m382();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5052) {
            return this.f16770.equals(((C5052) obj).f16770);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16770.hashCode();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8575() {
        if (this.f16769) {
            return;
        }
        C1332 c1332 = this.f16770;
        int size = c1332.f4612.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryM2841 = c1332.m2841(i);
            if (entryM2841.getValue() instanceof AbstractC0318) {
                AbstractC0318 abstractC0318 = (AbstractC0318) entryM2841.getValue();
                abstractC0318.getClass();
                C5734 c5734 = C5734.f18904;
                c5734.getClass();
                c5734.m9541(abstractC0318.getClass()).mo3387(abstractC0318);
                abstractC0318.m676();
            }
        }
        if (!c1332.f4609) {
            if (c1332.f4612.size() > 0) {
                c1332.m2841(0).getKey().getClass();
                C0178.m382();
                return;
            } else {
                Iterator it = c1332.m2846().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    C0178.m382();
                    return;
                }
            }
        }
        if (!c1332.f4609) {
            c1332.f4611 = c1332.f4611.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1332.f4611);
            c1332.f4608 = c1332.f4608.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1332.f4608);
            c1332.f4609 = true;
        }
        this.f16769 = true;
    }

    public C5052() {
    }
}
