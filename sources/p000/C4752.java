package p000;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: ۦٝؕ۠ٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4752 {

    /* JADX INFO: renamed from: ۥؗ */
    public Object f15684;

    /* JADX INFO: renamed from: ۥُ */
    public Object f15685;

    /* JADX INFO: renamed from: ۥۗ */
    public Object f15686;

    /* JADX INFO: renamed from: ۥۣ */
    public boolean f15687 = false;

    /* JADX INFO: renamed from: ۦؑ */
    public Object f15688;

    /* JADX WARN: Code duplicated, block: B:116:0x0294  */
    /* JADX WARN: Code duplicated, block: B:117:0x0297  */
    /* JADX WARN: Code duplicated, block: B:120:0x029d  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:125:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:130:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:131:0x0301  */
    /* JADX WARN: Code duplicated, block: B:133:0x0305  */
    /* JADX WARN: Code duplicated, block: B:166:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x010c  */
    public C4752(C0336 c0336, C2268 c2268) {
        C5147 c5147M6295;
        char c;
        long j;
        long j2;
        String str;
        int i = 1;
        C4342 c4342 = c0336.f1253;
        C1704 c1704 = c0336.f1252;
        if (c4342.f14329.isEmpty()) {
            C1704.m3512().equals(c1704);
        }
        this.f15686 = c1704.m3515();
        this.f15684 = c1704.m3514();
        c1704.getClass();
        c1704.getClass();
        Map mapM3517 = c1704.m3519() == 0 ? null : c1704.m3517();
        if (mapM3517 != null) {
            Set setKeySet = mapM3517.keySet();
            if (!(setKeySet instanceof AbstractC4821) || (setKeySet instanceof SortedSet) || ((AbstractC4821) setKeySet).mo352()) {
                Object[] array = setKeySet.toArray();
                AbstractC4821.m8196(array.length, array);
            }
        } else {
            int i2 = AbstractC4821.f15885;
            Object[] objArr = C2745.f9079;
        }
        int iM3519 = c1704.m3519();
        C4342 c4343 = c0336.f1253;
        char c2 = 3;
        if (iM3519 > 0) {
            Collection<C2027> collectionValues = c1704.m3517().values();
            if (collectionValues == null) {
                c5147M6295 = C5147.f17050;
            } else {
                C3510 c3510 = new C3510(4);
                for (C2027 c2027 : collectionValues) {
                    int iM3977 = c2027.m3977();
                    int i3 = iM3977 - 1;
                    if (iM3977 == 0) {
                        throw null;
                    }
                    if (i3 == 0) {
                        c3510.m6302(c2027.m3973(), Long.valueOf(c2027.m3972()));
                    } else if (i3 == 1) {
                        c3510.m6302(c2027.m3973(), Boolean.valueOf(c2027.m3975()));
                    } else if (i3 == 2) {
                        c3510.m6302(c2027.m3973(), Double.valueOf(c2027.m3979()));
                    } else if (i3 == 3) {
                        c3510.m6302(c2027.m3973(), c2027.m3981());
                    } else {
                        if (i3 != 4) {
                            C1078.m2276("Could not serialize Flag for override: ".concat(String.valueOf(c2027.m3973())));
                            throw null;
                        }
                        c3510.m6302(c2027.m3973(), c2027.m3976().m7608());
                    }
                }
                c5147M6295 = c3510.m6295(false);
            }
            if (!c5147M6295.isEmpty()) {
                HashMap map = new HashMap(c5147M6295);
                AbstractC1425 abstractC1425 = c4343.f14329;
                C3094 c3094 = new C3094(4);
                AbstractC0219 it = abstractC1425.iterator();
                while (true) {
                    C1868 c1868 = (C1868) it;
                    if (!c1868.hasNext()) {
                        for (String str2 : map.keySet()) {
                            Object obj = map.get(str2);
                            int length = str2.length();
                            if (length <= 19) {
                                if (length == 0) {
                                    c = c2;
                                } else {
                                    c = c2;
                                    long jCharAt = str2.charAt(0) - '0';
                                    if (jCharAt >= 1) {
                                        if (jCharAt <= 9) {
                                            int i4 = i;
                                            while (true) {
                                                if (i4 >= length) {
                                                    j = 0;
                                                    if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                                                        j2 = jCharAt;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                int iCharAt = str2.charAt(i4) - '0';
                                                j = 0;
                                                if (!((iCharAt < 0) | (iCharAt > 9))) {
                                                    jCharAt = (jCharAt * 10) + ((long) iCharAt);
                                                    i4++;
                                                }
                                            }
                                        }
                                        if (j2 == j) {
                                            str = str2;
                                        } else {
                                            str = null;
                                        }
                                        if (obj instanceof String) {
                                            c3094.m5683(new C5105(j2, str, 4, 0L, obj));
                                        } else if (obj instanceof byte[]) {
                                            c3094.m5683(new C5105(j2, str, 5, 0L, obj));
                                        } else if (obj instanceof Boolean) {
                                            c3094.m5683(new C5105(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                        } else if (obj instanceof Long) {
                                            c3094.m5683(new C5105(j2, str, 2, ((Long) obj).longValue(), null));
                                        } else {
                                            if (obj instanceof Double) {
                                                String strValueOf = String.valueOf(obj);
                                                StringBuilder sb = new StringBuilder(str2.length() + 28 + strValueOf.length());
                                                sb.append("Cannot serialize override ");
                                                sb.append(str2);
                                                sb.append(": ");
                                                sb.append(strValueOf);
                                                throw new IllegalStateException(sb.toString());
                                            }
                                            c3094.m5683(new C5105(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                        }
                                        c2 = c;
                                        i = 1;
                                    }
                                    j2 = j;
                                    if (j2 == j) {
                                        str = str2;
                                    } else {
                                        str = null;
                                    }
                                    if (obj instanceof String) {
                                        c3094.m5683(new C5105(j2, str, 4, 0L, obj));
                                    } else if (obj instanceof byte[]) {
                                        c3094.m5683(new C5105(j2, str, 5, 0L, obj));
                                    } else if (obj instanceof Boolean) {
                                        c3094.m5683(new C5105(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                    } else if (obj instanceof Long) {
                                        c3094.m5683(new C5105(j2, str, 2, ((Long) obj).longValue(), null));
                                    } else {
                                        if (obj instanceof Double) {
                                            String strValueOf2 = String.valueOf(obj);
                                            StringBuilder sb2 = new StringBuilder(str2.length() + 28 + strValueOf2.length());
                                            sb2.append("Cannot serialize override ");
                                            sb2.append(str2);
                                            sb2.append(": ");
                                            sb2.append(strValueOf2);
                                            throw new IllegalStateException(sb2.toString());
                                        }
                                        c3094.m5683(new C5105(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                    }
                                    c2 = c;
                                    i = 1;
                                }
                                j = 0;
                                j2 = 0;
                                if (j2 == j) {
                                    str = str2;
                                } else {
                                    str = null;
                                }
                                if (obj instanceof String) {
                                    c3094.m5683(new C5105(j2, str, 4, 0L, obj));
                                } else if (obj instanceof byte[]) {
                                    c3094.m5683(new C5105(j2, str, 5, 0L, obj));
                                } else if (obj instanceof Boolean) {
                                    c3094.m5683(new C5105(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                } else if (obj instanceof Long) {
                                    c3094.m5683(new C5105(j2, str, 2, ((Long) obj).longValue(), null));
                                } else {
                                    if (obj instanceof Double) {
                                        String strValueOf3 = String.valueOf(obj);
                                        StringBuilder sb3 = new StringBuilder(str2.length() + 28 + strValueOf3.length());
                                        sb3.append("Cannot serialize override ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        sb3.append(strValueOf3);
                                        throw new IllegalStateException(sb3.toString());
                                    }
                                    c3094.m5683(new C5105(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                }
                                c2 = c;
                                i = 1;
                            } else {
                                c = c2;
                            }
                            j = 0;
                            j2 = j;
                            if (j2 == j) {
                                str = str2;
                            } else {
                                str = null;
                            }
                            if (obj instanceof String) {
                                c3094.m5683(new C5105(j2, str, 4, 0L, obj));
                            } else if (obj instanceof byte[]) {
                                c3094.m5683(new C5105(j2, str, 5, 0L, obj));
                            } else if (obj instanceof Boolean) {
                                c3094.m5683(new C5105(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                            } else if (obj instanceof Long) {
                                c3094.m5683(new C5105(j2, str, 2, ((Long) obj).longValue(), null));
                            } else {
                                if (obj instanceof Double) {
                                    String strValueOf4 = String.valueOf(obj);
                                    StringBuilder sb4 = new StringBuilder(str2.length() + 28 + strValueOf4.length());
                                    sb4.append("Cannot serialize override ");
                                    sb4.append(str2);
                                    sb4.append(": ");
                                    sb4.append(strValueOf4);
                                    throw new IllegalStateException(sb4.toString());
                                }
                                c3094.m5683(new C5105(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                            }
                            c2 = c;
                            i = 1;
                        }
                        c4343 = new C4342(c3094.m5681());
                        break;
                    }
                    C5105 c5105 = (C5105) c1868.next();
                    Object obj2 = c5105.f16947;
                    long j3 = c5105.f16948;
                    Object objRemove = map.remove(obj2 == null ? Long.toString(j3) : obj2);
                    if (objRemove == null) {
                        c3094.m5683(c5105);
                    } else if (objRemove instanceof String) {
                        c3094.m5683(new C5105(c5105.f16948, c5105.f16947, 4, 0L, objRemove));
                    } else if (objRemove instanceof byte[]) {
                        c3094.m5683(new C5105(c5105.f16948, c5105.f16947, 5, 0L, objRemove));
                    } else if (objRemove instanceof Boolean) {
                        c3094.m5683(new C5105(c5105.f16948, c5105.f16947, ((Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
                    } else if (objRemove instanceof Long) {
                        c3094.m5683(new C5105(c5105.f16948, c5105.f16947, 2, ((Long) objRemove).longValue(), null));
                    } else {
                        if (!(objRemove instanceof Double)) {
                            String string = c5105.f16947;
                            string = string == null ? Long.toString(j3) : string;
                            String string2 = objRemove.toString();
                            StringBuilder sb5 = new StringBuilder(String.valueOf(string).length() + 46 + string2.length());
                            sb5.append("Cannot serialize override for existing flag ");
                            sb5.append(string);
                            sb5.append(": ");
                            sb5.append(string2);
                            throw new IllegalStateException(sb5.toString());
                        }
                        c3094.m5683(new C5105(c5105.f16948, c5105.f16947, 3, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null));
                    }
                }
            }
        }
        int size = ((C2912) c4343.f14329).f9706.size() + 3;
        AbstractC3933.m7099(size, "expectedSize");
        C3510 c3511 = new C3510(size);
        AbstractC0219 it2 = c4343.f14329.iterator();
        while (true) {
            C1868 c1869 = (C1868) it2;
            if (!c1869.hasNext()) {
                c3511.m6302("__phenotype_server_token", c1704.m3516());
                c3511.m6302("__phenotype_snapshot_token", c1704.m3515());
                c3511.m6302("__phenotype_configuration_version", Long.valueOf(c1704.m3518()));
                this.f15688 = c3511.m6295(false);
                this.f15685 = c2268;
                return;
            }
            C5105 c5106 = (C5105) c1869.next();
            String string3 = c5106.f16947;
            if (string3 == null) {
                string3 = Long.toString(c5106.f16948);
            }
            c3511.m6302(string3, c5106.m8737());
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public ViewParent m8071(int i) {
        if (i == 0) {
            return (ViewParent) this.f15686;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.f15684;
    }

    /* JADX INFO: renamed from: ۥُ */
    public C1033 m8072(boolean z) throws IOException {
        try {
            C1033 c1033Mo4255 = ((InterfaceC4559) this.f15688).mo4255(z);
            if (c1033Mo4255 == null) {
                return c1033Mo4255;
            }
            c1033Mo4255.f3648 = this;
            return c1033Mo4255;
        } catch (IOException e) {
            m8073(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public void m8073(IOException iOException) {
        this.f15687 = true;
        ((C4087) this.f15684).m7277(iOException);
        C3641 c3641Mo4247 = ((InterfaceC4559) this.f15688).mo4247();
        C0201 c0201 = (C0201) this.f15686;
        synchronized (c3641Mo4247) {
            try {
                if (!(iOException instanceof C5629)) {
                    if (!(c3641Mo4247.f12189 != null) || (iOException instanceof C0824)) {
                        c3641Mo4247.f12186 = true;
                        if (c3641Mo4247.f12185 == 0) {
                            C3641.m6503(c0201.f746, c3641Mo4247.f12181, iOException);
                            c3641Mo4247.f12184++;
                        }
                    }
                } else if (((C5629) iOException).f18557 == 8) {
                    int i = c3641Mo4247.f12190 + 1;
                    c3641Mo4247.f12190 = i;
                    if (i > 1) {
                        c3641Mo4247.f12186 = true;
                        c3641Mo4247.f12184++;
                    }
                } else if (((C5629) iOException).f18557 != 9 || !c0201.f732) {
                    c3641Mo4247.f12186 = true;
                    c3641Mo4247.f12184++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public boolean m8074(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM8071;
        int i6;
        int i7;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.f15688;
        if (this.f15687 && (viewParentM8071 = m8071(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    int[] iArr4 = (int[]) this.f15685;
                    if (iArr4 == null) {
                        iArr4 = new int[2];
                        this.f15685 = iArr4;
                    }
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM8071 instanceof InterfaceC1031) {
                    ((InterfaceC1031) viewParentM8071).mo17(nestedScrollView, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM8071 instanceof InterfaceC3055) {
                        ((InterfaceC3055) viewParentM8071).mo18(nestedScrollView, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentM8071.onNestedScroll(nestedScrollView, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM8071 + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public IOException m8075(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            m8073(iOException);
        }
        return ((C0201) this.f15686).m465(this, z2, z, iOException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۦؑ */
    public int m8076(C3369 c3369, ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, boolean z) {
        int i;
        byte b;
        int i2;
        int i3;
        C3622 c3622 = (C3622) this.f15684;
        C0679 c0679 = (C0679) this.f15685;
        if (this.f15687) {
            return 0;
        }
        try {
            this.f15687 = true;
            C5470 c5470M5738 = ((C3121) this.f15688).m5738(c3369, viewTreeObserverOnGlobalLayoutListenerC0850);
            C0638 c0638 = (C0638) c5470M5738.f18034;
            int iM1456 = c0638.m1456();
            while (true) {
                if (i >= iM1456) {
                    b = true;
                    break;
                }
                C3536 c3536 = (C3536) c0638.m1453(i);
                i = (c3536.f11733 || c3536.f11731) ? 0 : i + 1;
                b = false;
                break;
            }
            int iM1457 = c0638.m1456();
            for (int i4 = 0; i4 < iM1457; i4++) {
                C3536 c3537 = (C3536) c0638.m1453(i4);
                if (b != false || AbstractC3801.m6800(c3537)) {
                    ((C0605) this.f15686).m1317(c3537.f11726, c0679, c3537.f11737, true);
                    if (!c0679.f2484.m5078()) {
                        c3622.m6449(c3537.f11732, c0679, AbstractC3801.m6800(c3537));
                        c0679.clear();
                    }
                }
            }
            boolean zM6448 = c3622.m6448(c5470M5738, z);
            if (c5470M5738.f18035) {
                i2 = 0;
                break;
            }
            int iM1458 = c0638.m1456();
            int i5 = 0;
            while (true) {
                if (i5 >= iM1458) {
                    i2 = 0;
                    break;
                }
                C3536 c3538 = (C3536) c0638.m1453(i5);
                if (!C1553.m3306(AbstractC3801.m6747(c3538, true), 0L) && c3538.m6326()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iM1459 = c0638.m1456();
            for (int i6 = 0; i6 < iM1459; i6++) {
                if (((C3536) c0638.m1453(i6)).m6326()) {
                    i3 = 1;
                    return (zM6448 ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zM6448 ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.f15687 = false;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public void m8077(int i, int i2) {
        if (i < 0.0f) {
            AbstractC4690.m8038("Index should be non-negative (" + i + ')');
        }
        ((C0169) this.f15686).m359(i);
        ((C3779) this.f15685).m6681(i);
        ((C0169) this.f15684).m359(i2);
    }

    public C4752(C0268 c0268, C2268 c2268) {
        C0268.m548().equals(c0268);
        this.f15686 = c0268.m555();
        this.f15684 = c0268.m553();
        int i = AbstractC4821.f15885;
        Object[] objArr = C2745.f9079;
        int iM557 = c0268.m557() + 3;
        AbstractC3933.m7099(iM557, "expectedSize");
        C3510 c3510 = new C3510(iM557);
        for (C5161 c5161 : c0268.m561()) {
            int iM8761 = c5161.m8761();
            int i2 = iM8761 - 1;
            if (iM8761 == 0) {
                throw null;
            }
            if (i2 == 0) {
                c3510.m6302(c5161.m8760(), Long.valueOf(c5161.m8759()));
            } else if (i2 == 1) {
                c3510.m6302(c5161.m8760(), Boolean.valueOf(c5161.m8762()));
            } else if (i2 == 2) {
                c3510.m6302(c5161.m8760(), Double.valueOf(c5161.m8766()));
            } else if (i2 == 3) {
                c3510.m6302(c5161.m8760(), c5161.m8768());
            } else if (i2 == 4) {
                c3510.m6302(c5161.m8760(), c5161.m8764().m7608());
            }
        }
        c3510.m6302("__phenotype_server_token", c0268.m556());
        c3510.m6302("__phenotype_snapshot_token", c0268.m555());
        c3510.m6302("__phenotype_configuration_version", Long.valueOf(c0268.m559()));
        this.f15688 = c3510.m6295(false);
        this.f15685 = c2268;
    }
}
