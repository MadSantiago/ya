package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۥٖٔؑ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1308 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final WeakHashMap f4494 = new WeakHashMap();

    /* JADX INFO: renamed from: ۥۗ */
    public static final WeakHashMap f4493 = new WeakHashMap();

    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f1 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۣ */
    public static void m2774(Throwable th) {
        Throwable cause;
        C1745 c1745;
        AbstractC0866 abstractC0866;
        int i;
        WeakHashMap weakHashMap = f4493;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        WeakHashMap weakHashMap2 = f4494;
        synchronized (weakHashMap2) {
            Throwable cause2 = th;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (cause2 == null) {
                c1745 = null;
            } else {
                weakHashMap2.put(th, (C3355) weakHashMap2.get(cause2));
                c1745 = new C1745(22);
            }
        }
        if (c1745 != null || (abstractC0866 = AbstractC5474.m9168().f3670) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (abstractC0866 = AbstractC5474.m9168().f3670; abstractC0866 != null; abstractC0866 = abstractC0866.f3189) {
            arrayList.add(abstractC0866);
        }
        UUID uuid = ((AbstractC0866) arrayList.get(0)).f3188;
        ((AbstractC0866) arrayList.get(0)).getClass();
        int size = arrayList.size();
        C1868 c1868 = AbstractC4822.f15887;
        AbstractC3933.m7099(size, "expectedSize");
        AbstractC3933.m7099(size, "initialCapacity");
        Object[] objArrCopyOf = new Object[size];
        int size2 = arrayList.size();
        AbstractC3933.m7099(size2, "expectedSize");
        AbstractC3933.m7099(size2, "initialCapacity");
        Object[] objArrCopyOf2 = new Object[size2];
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        for (AbstractC0866 abstractC0867 : C4773.m8143(arrayList)) {
            String str = abstractC0867.f3187;
            int i4 = i3 + 1;
            if (objArrCopyOf2.length < i4) {
                objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, C3094.m5680(objArrCopyOf2.length, i4));
            } else {
                if (z2) {
                    objArrCopyOf2 = (Object[]) objArrCopyOf2.clone();
                }
                int i5 = i3 + 1;
                objArrCopyOf2[i3] = str;
                AbstractC0191 abstractC0191Mo1184 = abstractC0867.mo1184();
                abstractC0191Mo1184.getClass();
                i = i2 + 1;
                if (objArrCopyOf.length < i) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, C3094.m5680(objArrCopyOf.length, i));
                } else {
                    if (z) {
                        objArrCopyOf = (Object[]) objArrCopyOf.clone();
                    }
                    objArrCopyOf[i2] = abstractC0191Mo1184;
                    i2++;
                    i3 = i5;
                }
                z = false;
                objArrCopyOf[i2] = abstractC0191Mo1184;
                i2++;
                i3 = i5;
            }
            z2 = false;
            int i6 = i3 + 1;
            objArrCopyOf2[i3] = str;
            AbstractC0191 abstractC0191Mo1185 = abstractC0867.mo1184();
            abstractC0191Mo1185.getClass();
            i = i2 + 1;
            if (objArrCopyOf.length < i) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, C3094.m5680(objArrCopyOf.length, i));
            } else {
                if (z) {
                    objArrCopyOf = (Object[]) objArrCopyOf.clone();
                }
                objArrCopyOf[i2] = abstractC0191Mo1185;
                i2++;
                i3 = i6;
            }
            z = false;
            objArrCopyOf[i2] = abstractC0191Mo1185;
            i2++;
            i3 = i6;
        }
        WeakHashMap weakHashMap3 = f4494;
        synchronized (weakHashMap3) {
            try {
                C4645 c4645M8197 = AbstractC4822.m8197(i3, objArrCopyOf2);
                if (c4645M8197 == null) {
                    throw new NullPointerException("Null spansNames");
                }
                C4645 c4645M8198 = AbstractC4822.m8197(i2, objArrCopyOf);
                if (c4645M8198 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th, new C3355(c4645M8197, c4645M8198, uuid));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
