package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ۦٛؒؓۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4602 extends AbstractC2426 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥؓ */
    public int f15184;

    /* JADX INFO: renamed from: ۥؖ */
    public C3639 f15185;

    /* JADX INFO: renamed from: ۥً */
    public final /* synthetic */ C0469 f15186;

    /* JADX INFO: renamed from: ۥَ */
    public List f15187;

    /* JADX INFO: renamed from: ۥٖ */
    public List f15188;

    /* JADX INFO: renamed from: ۥٙ */
    public Set f15189;

    /* JADX INFO: renamed from: ۥۖ */
    public C3639 f15190;

    /* JADX INFO: renamed from: ۥۧ */
    public /* synthetic */ C2404 f15191;

    /* JADX INFO: renamed from: ۦٕ */
    public C3639 f15192;

    /* JADX INFO: renamed from: ۦٗ */
    public List f15193;

    /* JADX INFO: renamed from: ۦۛ */
    public C3639 f15194;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4602(C0469 c0469, InterfaceC0443 interfaceC0443) {
        super(3, interfaceC0443);
        this.f15186 = c0469;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static final void m8003(List list, C0469 c0469) {
        list.clear();
        synchronized (c0469.f1693) {
            try {
                ArrayList arrayList = c0469.f1712;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((AbstractC0210) arrayList.get(i));
                }
                c0469.f1712.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0077 A[Catch: all -> 0x0029, LOOP:1: B:12:0x0041->B:22:0x0077, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc A[Catch: all -> 0x0029, LOOP:3: B:27:0x008f->B:37:0x00bc, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff A[Catch: all -> 0x0029, LOOP:5: B:41:0x00cf->B:51:0x00ff, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0082 A[EDGE_INSN: B:61:0x0082->B:24:0x0082 BREAK  A[LOOP:1: B:12:0x0041->B:22:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf A[EDGE_INSN: B:66:0x00bf->B:38:0x00bf BREAK  A[LOOP:3: B:27:0x008f->B:37:0x00bc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0102 A[EDGE_INSN: B:71:0x0102->B:52:0x0102 BREAK  A[LOOP:5: B:41:0x00cf->B:51:0x00ff], SYNTHETIC] */
    /* JADX INFO: renamed from: ۦۛ */
    public static final void m8004(C0469 c0469, List list, List list2, List list3, C3639 c3639, C3639 c36310, C3639 c36311, C3639 c36312) {
        char c;
        long j;
        long j2;
        synchronized (c0469.f1693) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    C1946 c1946 = (C1946) list3.get(i);
                    c1946.m3822();
                    c0469.m1011(c1946);
                }
                list3.clear();
                Object[] objArr = c3639.f12174;
                long[] jArr = c3639.f12175;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    C1946 c1947 = (C1946) objArr[(i2 << 3) + i4];
                                    c1947.m3822();
                                    c0469.m1011(c1947);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i2 != length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                c3639.m6493();
                Object[] objArr2 = c36310.f12174;
                long[] jArr2 = c36310.f12175;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) == j2) {
                            if (i5 != length2) {
                                break;
                                break;
                            }
                            i5++;
                        } else {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((C1946) objArr2[(i5 << 3) + i7]).m3831();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 != length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                c36310.m6493();
                c36311.m6493();
                Object[] objArr3 = c36312.f12174;
                long[] jArr3 = c36312.f12175;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) == j2) {
                            if (i8 != length3) {
                                break;
                                break;
                            }
                            i8++;
                        } else {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    C1946 c1948 = (C1946) objArr3[(i8 << 3) + i10];
                                    c1948.m3822();
                                    c0469.m1011(c1948);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 != length3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                c36312.m6493();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x009a A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:21:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d1 A[Catch: all -> 0x00e8, TRY_LEAVE, TryCatch #1 {, blocks: (B:19:0x00c9, B:22:0x00d1), top: B:91:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:43:0x0126  */
    /* JADX WARN: Code duplicated, block: B:88:0x0271  */
    /* JADX WARN: Code duplicated, block: B:91:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0126 -> B:44:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0271 -> B:12:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4602.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        C4602 c4602 = new C4602(this.f15186, (InterfaceC0443) obj3);
        c4602.f15191 = (C2404) obj2;
        c4602.mo218(C2358.f7817);
        return EnumC2282.f7590;
    }
}
