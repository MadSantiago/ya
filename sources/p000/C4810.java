package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: ۦًٞؖؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4810 {

    /* JADX INFO: renamed from: ۥؗ */
    public final ArrayList f15856;

    /* JADX INFO: renamed from: ۥۗ */
    public final HashMap f15857;

    /* JADX INFO: renamed from: ۥۣ */
    public final HashMap f15858;

    public C4810(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.f15858 = new HashMap();
        this.f15857 = new HashMap();
        this.f15856 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC1008 interfaceC1008 = (InterfaceC1008) it.next();
            if (TextUtils.isEmpty(interfaceC1008.mo2217())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                InterfaceC1008 interfaceC1009 = (InterfaceC1008) this.f15858.put(interfaceC1008.mo2217(), interfaceC1008);
                if (interfaceC1009 != null) {
                    String canonicalName = interfaceC1009.getClass().getCanonicalName();
                    String canonicalName2 = interfaceC1008.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length());
                    sb.append("Cannot override Backend ");
                    sb.append(canonicalName);
                    sb.append(" with ");
                    sb.append(canonicalName2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw AbstractC5078.m8675(it2);
        }
        this.f15856.addAll(list);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C3455 m8182(Uri uri) throws C2943 {
        List listM5682;
        C1868 c1868 = AbstractC4822.f15887;
        AbstractC3933.m7099(4, "initialCapacity");
        Object[] objArr = new Object[4];
        AbstractC3933.m7099(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            listM5682 = C4645.f15320;
        } else {
            Iterable c5790 = new C5790(new C1829(new C1039(12, new C5335("+".charAt(0))), true), encodedFragment.substring(10));
            if (c5790 instanceof Collection) {
                listM5682 = AbstractC4822.m8198((Collection) c5790);
            } else {
                Iterator it = c5790.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        C3094 c3094 = new C3094(4);
                        c3094.m5683(next);
                        while (it.hasNext()) {
                            c3094.m5683(it.next());
                        }
                        listM5682 = c3094.m5682();
                    } else {
                        Object[] objArr2 = {next};
                        AbstractC3831.m6883(1, objArr2);
                        listM5682 = AbstractC4822.m8197(1, objArr2);
                    }
                } else {
                    listM5682 = C4645.f15320;
                }
            }
        }
        int size = listM5682.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            String str = (String) listM5682.get(i);
            Matcher matcher = AbstractC0621.f2310.matcher(str);
            if (!matcher.matches()) {
                C1078.m2272("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i3 = i2 + 1;
            if (objArrCopyOf.length < i3) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, C3094.m5680(objArrCopyOf.length, i3));
            }
            objArrCopyOf[i2] = strGroup;
            i++;
            i2++;
        }
        C4645 c4645M8197 = AbstractC4822.m8197(i2, objArrCopyOf);
        if (c4645M8197.f15322 > 0) {
            String str2 = (String) c4645M8197.get(0);
            if (this.f15857.get(str2) != null) {
                C0178.m382();
                return null;
            }
            String strValueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(str2.length() + 40 + strValueOf.length());
            sb.append("Requested transform isn't registered: ");
            sb.append(str2);
            sb.append(": ");
            sb.append(strValueOf);
            throw new C2943(sb.toString());
        }
        AbstractC4822 abstractC4822Mo2770 = AbstractC4822.m8197(0, objArr).mo2770();
        C3455 c3455 = new C3455();
        String scheme = uri.getScheme();
        InterfaceC1008 interfaceC1008 = (InterfaceC1008) this.f15858.get(scheme);
        if (interfaceC1008 == null) {
            throw new C2943(AbstractC3761.m6628("Requested backend isn't registered: ", scheme));
        }
        c3455.f11471 = interfaceC1008;
        c3455.f11469 = this.f15856;
        c3455.f11470 = abstractC4822Mo2770;
        if (!abstractC4822Mo2770.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = abstractC4822Mo2770.listIterator(abstractC4822Mo2770.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous() != null) {
                        C0178.m382();
                        return null;
                    }
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        c3455.f11472 = uri;
        C3455 c3456 = new C3455();
        c3456.f11471 = c3455.f11471;
        c3456.f11470 = c3455.f11470;
        c3456.f11469 = c3455.f11469;
        c3456.f11472 = c3455.f11472;
        return c3456;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object m8183(Uri uri, InterfaceC3324 interfaceC3324) {
        return interfaceC3324.mo5516(m8182(uri));
    }
}
