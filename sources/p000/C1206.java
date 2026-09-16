package p000;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: ۥؘْؓ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1206 implements Comparator {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4157;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C1206 f4156 = new C1206(0);

    /* JADX INFO: renamed from: ۥْ */
    public static final C1206 f4152 = new C1206(1);

    /* JADX INFO: renamed from: ۥٓ */
    public static final C1206 f4153 = new C1206(2);

    /* JADX INFO: renamed from: ۥَ */
    public static final C1206 f4151 = new C1206(3);

    /* JADX INFO: renamed from: ۥٖ */
    public static final C1206 f4154 = new C1206(4);

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ C1206 f4155 = new C1206(19);

    public /* synthetic */ C1206(int i) {
        this.f4157 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4157) {
            case 0:
                C3468 c3468 = (C3468) obj;
                C3468 c3469 = (C3468) obj2;
                if (AbstractC3925.m7027(c3468) && AbstractC3925.m7027(c3469)) {
                    C0605 c0605M9270 = AbstractC5537.m9270(c3468);
                    C0605 c0605M9271 = AbstractC5537.m9270(c3469);
                    if (!AbstractC3831.m6874(c0605M9270, c0605M9271)) {
                        Object[] objArr = new C0605[16];
                        int i = 0;
                        while (c0605M9270 != null) {
                            int i2 = i + 1;
                            if (objArr.length < i2) {
                                int length = objArr.length;
                                Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
                            if (i != 0) {
                                System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                            }
                            objArr[0] = c0605M9270;
                            i++;
                            c0605M9270 = c0605M9270.m1356();
                        }
                        Object[] objArr3 = new C0605[16];
                        int i3 = 0;
                        while (c0605M9271 != null) {
                            int i4 = i3 + 1;
                            if (objArr3.length < i4) {
                                int length2 = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length2);
                                objArr3 = objArr4;
                            }
                            if (i3 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                            }
                            objArr3[0] = c0605M9271;
                            i3++;
                            c0605M9271 = c0605M9271.m1356();
                        }
                        int iMin = Math.min(i - 1, i3 - 1);
                        if (iMin >= 0) {
                            int i5 = 0;
                            while (AbstractC3831.m6874(objArr[i5], objArr3[i5])) {
                                if (i5 != iMin) {
                                    i5++;
                                }
                            }
                            return AbstractC3831.m6879(((C0605) objArr[i5]).m1362(), ((C0605) objArr3[i5]).m1362());
                        }
                        C1078.m2276("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (AbstractC3925.m7027(c3468)) {
                        return -1;
                    }
                    if (AbstractC3925.m7027(c3469)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                C2793 c2793M5763 = ((C3129) obj).m5763();
                C2793 c2793M5764 = ((C3129) obj2).m5763();
                int iCompare = Float.compare(c2793M5763.f9343, c2793M5764.f9343);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(c2793M5763.f9342, c2793M5764.f9342);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(c2793M5763.f9344, c2793M5764.f9344);
                return iCompare3 != 0 ? iCompare3 : Float.compare(c2793M5763.f9341, c2793M5764.f9341);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C0605 c0605 = (C0605) obj;
                C0605 c0606 = (C0605) obj2;
                int iM6879 = AbstractC3831.m6879(c0606.f2270, c0605.f2270);
                return iM6879 != 0 ? iM6879 : AbstractC3831.m6879(c0605.hashCode(), c0606.hashCode());
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C2793 c2793M5765 = ((C3129) obj).m5763();
                C2793 c2793M5766 = ((C3129) obj2).m5763();
                int iCompare4 = Float.compare(c2793M5766.f9341, c2793M5765.f9341);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(c2793M5765.f9342, c2793M5766.f9342);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(c2793M5765.f9344, c2793M5766.f9344);
                return iCompare6 != 0 ? iCompare6 : Float.compare(c2793M5766.f9343, c2793M5765.f9343);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C3869 c3869 = (C3869) obj;
                C3869 c38610 = (C3869) obj2;
                int iCompare7 = Float.compare(((C2793) c3869.f12915).f9342, ((C2793) c38610.f12915).f9342);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((C2793) c3869.f12915).f9344, ((C2793) c38610.f12915).f9344);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(((C2331) obj).f7718).compareTo(Integer.valueOf(((C2331) obj2).f7718));
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return Integer.valueOf(((C2331) obj).f7718).compareTo(Integer.valueOf(((C2331) obj2).f7718));
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = (String) obj;
                String str2 = (String) obj2;
                int iMin2 = Math.min(str.length(), str2.length());
                for (int i6 = 4; i6 < iMin2; i6++) {
                    char cCharAt = str.charAt(i6);
                    char cCharAt2 = str2.charAt(i6);
                    if (cCharAt != cCharAt2) {
                        if (AbstractC3831.m6879(cCharAt, cCharAt2) < 0) {
                            return -1;
                        }
                        return 1;
                    }
                }
                int length3 = str.length();
                int length4 = str2.length();
                if (length3 == length4) {
                    return 0;
                }
                if (length3 < length4) {
                    return -1;
                }
                return 1;
            case 8:
                C0605 c0607 = (C0605) obj;
                C0605 c0608 = (C0605) obj2;
                int iM68710 = AbstractC3831.m6879(c0607.f2270, c0608.f2270);
                return iM68710 != 0 ? iM68710 : AbstractC3831.m6879(c0607.hashCode(), c0608.hashCode());
            case 9:
                return ((C3570) obj).f11821.compareTo(((C3570) obj2).f11821);
            case 10:
                return ((C1046) obj).f3700.compareTo(((C1046) obj2).f3700);
            case 11:
                return ((C3570) obj).f11821.compareTo(((C3570) obj2).f11821);
            case 12:
                return AbstractC1605.m3368((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 13:
                return AbstractC1605.m3368((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 14:
                return AbstractC1605.m3368(((C0751) obj).f2731, ((C0751) obj2).f2731);
            case 15:
                return AbstractC1605.m3368(((C2886) obj).f9627, ((C2886) obj2).f9627);
            case 16:
                return AbstractC1605.m3368(((C2440) obj).f8129, ((C2440) obj2).f8129);
            case 17:
                int iM3998 = AbstractC2049.m3998(obj);
                int iM3999 = AbstractC2049.m3998(obj2);
                if (iM3998 != iM3999) {
                    return AbstractC3761.m6627(iM3998, iM3999);
                }
                int iM6632 = AbstractC3761.m6632(iM3998);
                if (iM6632 == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (iM6632 == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (iM6632 == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (iM6632 == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            case 18:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
