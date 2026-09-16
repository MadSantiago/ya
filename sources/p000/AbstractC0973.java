package p000;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: renamed from: ۥٍؚؖۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0973 extends AbstractC3649 {
    /* JADX INFO: renamed from: ۥؕ */
    public static final void m2036(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static Object m2037(Iterable iterable) {
        if (iterable instanceof List) {
            return m2045((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        C0178.m384("Collection is empty.");
        return null;
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static List m2038(List list) {
        int size = list.size() - 1;
        if (size <= 0) {
            return C2340.f7777;
        }
        if (size == 1) {
            return Collections.singletonList(m2040(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i = 1; i < size2; i++) {
                arrayList.add(list.get(i));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥٍ */
    public static List m2039(Iterable iterable) {
        boolean z = iterable instanceof Collection;
        C2340 c2340 = C2340.f7777;
        if (!z) {
            List listM2057 = m2057(iterable);
            int size = listM2057.size();
            if (size != 0) {
                return size != 1 ? listM2057 : Collections.singletonList(listM2057.get(0));
            }
            return c2340;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c2340;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: ۥِ */
    public static Object m2040(List list) {
        if (!list.isEmpty()) {
            return list.get(AbstractC2164.m4181(list));
        }
        C0178.m384("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: ۥٚ */
    public static long[] m2041(ArrayList arrayList) {
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: ۥٞ */
    public static List m2042(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            List listM2057 = m2057(iterable);
            if (((ArrayList) listM2057).size() > 1) {
                Collections.sort(listM2057);
            }
            return listM2057;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m2039(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Arrays.asList(array);
    }

    /* JADX INFO: renamed from: ۥۘ */
    public static Object m2043(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m2044(Iterable iterable, Object obj) {
        int iIndexOf;
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    AbstractC2164.m4180();
                    throw null;
                }
                if (AbstractC3831.m6874(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    /* JADX INFO: renamed from: ۥۡ */
    public static Object m2045(List list) {
        if (!list.isEmpty()) {
            return list.get(0);
        }
        C0178.m384("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ */
    public static ArrayList m2046(Collection collection, Object obj) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥۥ */
    public static final void m2047(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC4745 interfaceC4745) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC2765.m5146(sb, obj, interfaceC4745);
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: ۥۨ */
    public static /* synthetic */ void m2048(List list, StringBuilder sb, String str, InterfaceC4745 interfaceC4745, int i) {
        if ((i & 64) != 0) {
            interfaceC4745 = null;
        }
        m2047(list, sb, str, "", "", "...", interfaceC4745);
    }

    /* JADX INFO: renamed from: ۦ */
    public static ArrayList m2049(Collection collection, List list) {
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۦؓ */
    public static int[] m2050(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۦؔ */
    public static ArrayList m2051(List list, Object obj) {
        ArrayList arrayList = new ArrayList(AbstractC5573.m9402(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && AbstractC3831.m6874(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۦَ */
    public static Set m2052(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4554.m7911(collection.size()));
                m2036(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m2036(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : Collections.singleton(linkedHashSet2.iterator().next());
            }
        }
        return C1590.f5346;
    }

    /* JADX INFO: renamed from: ۦٝ */
    public static final int m2053(int i, List list) {
        if (i >= 0 && i <= AbstractC2164.m4181(list)) {
            return AbstractC2164.m4181(list) - i;
        }
        StringBuilder sbM8680 = AbstractC5078.m8680(i, "Element index ", " must be in range [");
        sbM8680.append(new C3046(0, AbstractC2164.m4181(list), 1));
        sbM8680.append("].");
        throw new IndexOutOfBoundsException(sbM8680.toString());
    }

    /* JADX INFO: renamed from: ۦٞ */
    public static final int m2054(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbM8680 = AbstractC5078.m8680(i, "Position index ", " must be in range [");
        sbM8680.append(new C3046(0, list.size(), 1));
        sbM8680.append("].");
        throw new IndexOutOfBoundsException(sbM8680.toString());
    }

    /* JADX INFO: renamed from: ۦٟ */
    public static List m2055(Iterable iterable, Comparator comparator) {
        if (!(iterable instanceof Collection)) {
            List listM2057 = m2057(iterable);
            AbstractC3872.m6902(listM2057, comparator);
            return listM2057;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m2039(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public static String m2056(Iterable iterable, String str, String str2, String str3, InterfaceC4745 interfaceC4745, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC4745 = null;
        }
        StringBuilder sb = new StringBuilder();
        m2047(iterable, sb, str4, str5, str6, "...", interfaceC4745);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۦۤ */
    public static final List m2057(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m2036(iterable, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۦۧ */
    public static Object m2058(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
