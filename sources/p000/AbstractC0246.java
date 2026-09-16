package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ۥًؒؓؖ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0246 extends AbstractC2774 {
    /* JADX INFO: renamed from: ۥؔ */
    public static boolean m506(Object[] objArr, Object obj) {
        return m518(objArr, obj) >= 0;
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static void m507(int[] iArr, int i) {
        Arrays.fill(iArr, 0, iArr.length, i);
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static void m508(long j, long[] jArr) {
        Arrays.fill(jArr, 0, jArr.length, j);
    }

    /* JADX INFO: renamed from: ۥِ */
    public static List m509(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? Arrays.asList(Arrays.copyOf(objArr, objArr.length)) : Collections.singletonList(objArr[0]);
        }
        return C2340.f7777;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static void m510(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static void m511(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static void m512(byte[] bArr, byte[] bArr2, int i, int i2) {
        System.arraycopy(bArr, i, bArr2, 0, i2 - i);
    }

    /* JADX INFO: renamed from: ۥۘ */
    public static Set m513(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C1590.f5346;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4554.m7911(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static Object[] m514(Object[] objArr, int i, int i2) {
        AbstractC2774.m5198(i2, objArr.length);
        return Arrays.copyOfRange(objArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥۡ */
    public static void m515(Object[] objArr, Object obj) {
        Arrays.fill(objArr, 0, objArr.length, obj);
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static void m516(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, i, i2);
    }

    /* JADX INFO: renamed from: ۥۥ */
    public static Object m517(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[0];
        }
        C0178.m384("Array is empty.");
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ */
    public static int m518(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۦؒ */
    public static void m519(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    /* JADX INFO: renamed from: ۦٖ */
    public static boolean m520(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i == iArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static boolean m521(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!m521((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof C5142) && (obj2 instanceof C5142)) {
                            if (!Arrays.equals(((C5142) obj).f17032, ((C5142) obj2).f17032)) {
                            }
                        } else if ((obj instanceof C2560) && (obj2 instanceof C2560)) {
                            if (!Arrays.equals(((C2560) obj).f8537, ((C2560) obj2).f8537)) {
                            }
                        } else if ((obj instanceof C5576) && (obj2 instanceof C5576)) {
                            if (!Arrays.equals(((C5576) obj).f18404, ((C5576) obj2).f18404)) {
                            }
                        } else if ((obj instanceof C4556) && (obj2 instanceof C4556)) {
                            if (!Arrays.equals(((C4556) obj).f15056, ((C4556) obj2).f15056)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public static String m522(Object[] objArr, InterfaceC4745 interfaceC4745, int i) {
        String str = (i & 1) != 0 ? ", " : "";
        String str2 = (i & 2) != 0 ? "" : "innermostOf(";
        String str3 = (i & 4) == 0 ? ")" : "";
        if ((i & 32) != 0) {
            interfaceC4745 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC2765.m5146(sb, obj, interfaceC4745);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static void m523(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: ۦۧ */
    public static List m524(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
