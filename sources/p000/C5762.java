package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۦۦؙؔۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5762 implements InterfaceC0814 {

    /* JADX INFO: renamed from: ۥْ */
    public C3262 f18990;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3262 f18991;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC4745 f18992;

    public C5762(Map map, InterfaceC4745 interfaceC4745) {
        C3262 c3262;
        this.f18992 = interfaceC4745;
        if (map == null || map.isEmpty()) {
            c3262 = null;
        } else {
            c3262 = new C3262(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c3262.m6023(entry.getKey(), entry.getValue());
            }
        }
        this.f18991 = c3262;
    }

    @Override // p000.InterfaceC0814
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo1712(Object obj) {
        return ((Boolean) this.f18992.mo211(obj)).booleanValue();
    }

    @Override // p000.InterfaceC0814
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo1713(String str) {
        C3262 c3262 = this.f18991;
        List list = c3262 != null ? (List) c3262.m6026(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && c3262 != null) {
            List listSubList = list.subList(1, list.size());
            int iM6017 = c3262.m6017(str);
            if (iM6017 < 0) {
                iM6017 = ~iM6017;
            }
            Object[] objArr = c3262.f10944;
            Object obj = objArr[iM6017];
            c3262.f10947[iM6017] = str;
            objArr[iM6017] = listSubList;
        }
        return list.get(0);
    }

    @Override // p000.InterfaceC0814
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC0468 mo1714(String str, InterfaceC4448 interfaceC4448) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!AbstractC2133.m4120(str.charAt(i))) {
                C3262 c3262 = this.f18990;
                if (c3262 == null) {
                    long[] jArr = AbstractC5064.f16815;
                    c3262 = new C3262();
                    this.f18990 = c3262;
                }
                Object objM6027 = c3262.m6027(str);
                if (objM6027 == null) {
                    objM6027 = new ArrayList();
                    c3262.m6023(str, objM6027);
                }
                ((List) objM6027).add(interfaceC4448);
                return new C2808(c3262, str, interfaceC4448, 27);
            }
        }
        C1078.m2272("Registered key is empty or blank");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // p000.InterfaceC0814
    /* JADX INFO: renamed from: ۦؑ */
    public final Map mo1715() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        C3262 c3262 = this.f18991;
        if (c3262 == null && this.f18990 == null) {
            return C0204.f751;
        }
        int i3 = 0;
        int i4 = c3262 != null ? c3262.f10945 : 0;
        C3262 c3263 = this.f18990;
        HashMap map = new HashMap(i4 + (c3263 != null ? c3263.f10945 : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (c3262 != null) {
            Object[] objArr = c3262.f10947;
            Object[] objArr2 = c3262.f10944;
            long[] jArr3 = c3262.f10948;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        C3262 c3264 = this.f18990;
        if (c3264 != null) {
            Object[] objArr3 = c3264.f10947;
            Object[] objArr4 = c3264.f10944;
            long[] jArr4 = c3264.f10948;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objMo449 = ((InterfaceC4448) list.get(i3)).mo449();
                                    if (objMo449 != null) {
                                        if (!mo1712(objMo449)) {
                                            C1078.m2278(AbstractC5378.m9073(objMo449));
                                            return null;
                                        }
                                        map.put(str, AbstractC2164.m4212(objMo449));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objMo4410 = ((InterfaceC4448) list.get(i3)).mo449();
                                        if (objMo4410 != null && !mo1712(objMo4410)) {
                                            C1078.m2278(AbstractC5378.m9073(objMo4410));
                                            return null;
                                        }
                                        arrayList.add(objMo4410);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }
}
