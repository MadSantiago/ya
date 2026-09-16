package p000;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦؚٖؗٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC4316 implements InterfaceC3240, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۥؓ */
    public final RunnableC0029 f14263;

    /* JADX INFO: renamed from: ۥؖ */
    public boolean f14264;

    /* JADX INFO: renamed from: ۥْ */
    public C5002 f14266;

    /* JADX INFO: renamed from: ۥٙ */
    public C1900 f14269;

    /* JADX INFO: renamed from: ۥۖ */
    public long f14270;

    /* JADX INFO: renamed from: ۦٕ */
    public final C4912 f14271;

    /* JADX INFO: renamed from: ۦۛ */
    public C4912 f14273;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3548 f14274;

    /* JADX INFO: renamed from: ۦۨ */
    public final ViewTreeObserverOnGlobalLayoutListenerC0850 f14275;

    /* JADX INFO: renamed from: ۥٓ */
    public final ArrayList f14267 = new ArrayList();

    /* JADX INFO: renamed from: ۥَ */
    public int f14265 = 1;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f14268 = true;

    /* JADX INFO: renamed from: ۦٗ */
    public final C5559 f14272 = AbstractC1631.m3405(1, 0, 6);

    public ViewOnAttachStateChangeListenerC4316(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, C3548 c3548) {
        this.f14275 = viewTreeObserverOnGlobalLayoutListenerC0850;
        this.f14274 = c3548;
        new Handler(Looper.getMainLooper());
        C4912 c4912 = AbstractC0137.f547;
        this.f14273 = c4912;
        this.f14271 = new C4912();
        this.f14269 = new C1900(viewTreeObserverOnGlobalLayoutListenerC0850.getSemanticsOwner().m9199(), c4912);
        this.f14263 = new RunnableC0029(3, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f14275.getHandler().removeCallbacks(this.f14263);
        this.f14266 = null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (p000.AbstractC2765.m5130(100, r0) == r4) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:13:0x002b). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ۥؗ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7609(p000.AbstractC0772 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p000.C5831
            if (r0 == 0) goto L13
            r0 = r9
            ۦٍۧؖۢ r0 = (p000.C5831) r0
            int r1 = r0.f19212
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19212 = r1
            goto L18
        L13:
            ۦٍۧؖۢ r0 = new ۦٍۧؖۢ
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f19209
            int r1 = r0.f19212
            r2 = 2
            r3 = 1
            ۥٟۚؕۨ r4 = p000.EnumC2282.f7590
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            ۥَٝؕٚ r1 = r0.f19210
            p000.AbstractC0186.m409(r9)
        L2b:
            r9 = r1
            goto L44
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r8)
            r8 = 0
            return r8
        L34:
            ۥَٝؕٚ r1 = r0.f19210
            p000.AbstractC0186.m409(r9)
            goto L52
        L3a:
            p000.AbstractC0186.m409(r9)
            ۥَٝؕٚ r9 = new ۥَٝؕٚ
            ۦۢؗۖؐ r1 = r8.f14272
            r9.<init>(r1)
        L44:
            r0.f19210 = r9
            r0.f19212 = r3
            java.lang.Object r1 = r9.m3745(r0)
            if (r1 != r4) goto L4f
            goto L85
        L4f:
            r7 = r1
            r1 = r9
            r9 = r7
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r1.m3744()
            boolean r9 = r8.m7611()
            if (r9 == 0) goto L66
            r8.m7618()
        L66:
            ۥًٕؖ r9 = r8.f14275
            android.os.Handler r9 = r9.getHandler()
            boolean r5 = r8.f14264
            if (r5 != 0) goto L79
            if (r9 == 0) goto L79
            r8.f14264 = r3
            ۥٛ r5 = r8.f14263
            r9.post(r5)
        L79:
            r0.f19210 = r1
            r0.f19212 = r2
            r5 = 100
            java.lang.Object r9 = p000.AbstractC2765.m5130(r5, r0)
            if (r9 != r4) goto L2b
        L85:
            return r4
        L86:
            ۥۜؑؒؑ r8 = p000.C2358.f7817
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnAttachStateChangeListenerC4316.m7609(ۥؚؒۥؔ):java.lang.Object");
    }

    @Override // p000.InterfaceC3240
    /* JADX INFO: renamed from: ۥَ */
    public final void mo2393() {
        this.f14266 = (C5002) this.f14274.mo449();
        m7615(-1, this.f14275.getSemanticsOwner().m9199());
        m7618();
    }

    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC5746 m7610() {
        if (this.f14268) {
            this.f14268 = false;
            this.f14273 = AbstractC2776.m5248(this.f14275.getSemanticsOwner(), C1931.f6365);
            this.f14270 = System.currentTimeMillis();
        }
        return this.f14273;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final boolean m7611() {
        return this.f14266 != null;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m7612(C3129 c3129, C1900 c1900) {
        int i = 0;
        C2732 c2732 = new C2732(i, c1900, this);
        c3129.getClass();
        List listM5756 = C3129.m5756(4, c3129);
        int size = listM5756.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = listM5756.get(i3);
            if (m7610().m9572(((C3129) obj).f10473)) {
                c2732.mo219(Integer.valueOf(i2), obj);
                i2++;
            }
        }
        List listM5757 = C3129.m5756(4, c3129);
        int size2 = listM5757.size();
        while (i < size2) {
            C3129 c31210 = (C3129) listM5757.get(i);
            AbstractC5746 abstractC5746M7610 = m7610();
            int i4 = c31210.f10473;
            if (abstractC5746M7610.m9572(i4)) {
                C4912 c4912 = this.f14271;
                if (c4912.m9572(i4)) {
                    Object objM9571 = c4912.m9571(i4);
                    if (objM9571 == null) {
                        throw AbstractC3761.m6633("node not present in pruned tree before this change");
                    }
                    m7612(c31210, (C1900) objM9571);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    @Override // p000.InterfaceC3240
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1784() {
        m7617(this.f14275.getSemanticsOwner().m9199());
        m7618();
        this.f14266 = null;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0173 A[EDGE_INSN: B:105:0x0173->B:80:0x0173 BREAK  A[LOOP:4: B:48:0x00e9->B:79:0x016c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[LOOP:2: B:21:0x006f->B:42:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x016c A[LOOP:4: B:48:0x00e9->B:79:0x016c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x00d4 A[EDGE_INSN: B:99:0x00d4->B:44:0x00d4 BREAK  A[LOOP:2: B:21:0x006f->B:42:0x00cb], SYNTHETIC] */
    /* JADX INFO: renamed from: ۦؑ */
    public final void m7613(AbstractC5746 abstractC5746) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        AbstractC5746 abstractC5747 = abstractC5746;
        int[] iArr3 = abstractC5747.f18947;
        long[] jArr = abstractC5747.f18948;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        C1900 c1900 = (C1900) this.f14271.m9571(i7);
                        C1307 c1307 = (C1307) abstractC5747.m9571(i7);
                        C3129 c3129 = c1307 != null ? c1307.f4492 : null;
                        if (c3129 == null) {
                            throw AbstractC3761.m6633("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = c3129.f10473;
                        C3262 c3262 = c3129.f10476.f8490;
                        if (c1900 == null) {
                            Object[] objArr = c3262.f10947;
                            long[] jArr2 = c3262.f10948;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                C3059 c3059 = (C3059) objArr[(i10 << 3) + i12];
                                                C3059 c30510 = AbstractC2771.f9198;
                                                if (AbstractC3831.m6874(c3059, c30510)) {
                                                    Object objM6027 = c3262.m6027(c30510);
                                                    if (objM6027 == null) {
                                                        objM6027 = null;
                                                    }
                                                    List list = (List) objM6027;
                                                    m7616(i8, String.valueOf(list != null ? (C1249) AbstractC0973.m2058(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 != length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    } else if (i10 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = c3262.f10947;
                            long[] jArr3 = c3262.f10948;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                C3059 c30511 = (C3059) objArr2[(i13 << 3) + i15];
                                                C3059 c30512 = AbstractC2771.f9198;
                                                if (AbstractC3831.m6874(c30511, c30512)) {
                                                    Object objM6028 = c1900.f6282.f8490.m6027(c30512);
                                                    if (objM6028 == null) {
                                                        objM6028 = null;
                                                    }
                                                    List list2 = (List) objM6028;
                                                    C1249 c1249 = list2 != null ? (C1249) AbstractC0973.m2058(list2) : null;
                                                    Object objM6029 = c3262.m6027(c30512);
                                                    if (objM6029 == null) {
                                                        objM6029 = null;
                                                    }
                                                    List list3 = (List) objM6029;
                                                    C1249 c12410 = list3 != null ? (C1249) AbstractC0973.m2058(list3) : null;
                                                    if (!AbstractC3831.m6874(c1249, c12410)) {
                                                        m7616(i8, String.valueOf(c12410));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    } else if (i13 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    abstractC5747 = abstractC5746;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            abstractC5747 = abstractC5746;
            iArr3 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    /* JADX INFO: renamed from: ۦؚ */
    public final void m7614() {
        C4912 c4912 = this.f14271;
        c4912.m8314();
        AbstractC5746 abstractC5746M7610 = m7610();
        int[] iArr = abstractC5746M7610.f18947;
        Object[] objArr = abstractC5746M7610.f18945;
        long[] jArr = abstractC5746M7610.f18948;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            c4912.m8319(iArr[i4], new C1900(((C1307) objArr[i4]).f4492, m7610()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.f14269 = new C1900(this.f14275.getSemanticsOwner().m9199(), m7610());
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0189  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX INFO: renamed from: ۦِ */
    public final void m7615(int i, C3129 c3129) {
        InterfaceC4745 interfaceC4745;
        int i2;
        C2793 c2793M5764;
        C2391 c2391;
        String strM7042;
        InterfaceC4745 interfaceC4746;
        if (m7611()) {
            C3262 c3262 = c3129.f10476.f8490;
            Object objM6027 = c3262.m6027(AbstractC2771.f9204);
            if (objM6027 == null) {
                objM6027 = null;
            }
            Boolean bool = (Boolean) objM6027;
            if (this.f14265 == 1 && AbstractC3831.m6874(bool, Boolean.TRUE)) {
                Object objM6028 = c3262.m6027(AbstractC0208.f778);
                if (objM6028 == null) {
                    objM6028 = null;
                }
                C0078 c0078 = (C0078) objM6028;
                if (c0078 != null && (interfaceC4746 = (InterfaceC4745) c0078.f14720) != null) {
                }
            } else if (this.f14265 == 2 && AbstractC3831.m6874(bool, Boolean.FALSE)) {
                Object objM6029 = c3262.m6027(AbstractC0208.f778);
                if (objM6029 == null) {
                    objM6029 = null;
                }
                C0078 c0079 = (C0078) objM6029;
                if (c0079 != null && (interfaceC4745 = (InterfaceC4745) c0079.f14720) != null) {
                }
            }
            int i3 = c3129.f10473;
            C5002 c5002 = this.f14266;
            int i4 = 0;
            if (c5002 != null && (i2 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId autofillId = this.f14275.getAutofillId();
                C3129 c3129M5766 = c3129.m5766();
                int i5 = c3129.f10473;
                if (c3129M5766 == null || (autofillId = c5002.m8394(c3129M5766.f10473)) != null) {
                    C2391 c2392 = i2 >= 29 ? new C2391(i4, AbstractC5183.m8790(AbstractC2875.m5448(c5002.f16550), autofillId, i5)) : null;
                    if (c2392 == null) {
                        c2391 = null;
                    } else {
                        ViewStructure viewStructure = (ViewStructure) c2392.f7924;
                        C2542 c2542 = c3129.f10476;
                        C3059 c3059 = AbstractC2771.f9225;
                        C3262 c3263 = c2542.f8490;
                        if (c3263.m6015(c3059)) {
                            c2391 = null;
                        } else {
                            Bundle extras = viewStructure.getExtras();
                            if (extras != null) {
                                extras.putLong("android.view.contentcapture.EventTimestamp", this.f14270);
                                extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                            }
                            Object objM60210 = c3263.m6027(AbstractC2771.f9194);
                            if (objM60210 == null) {
                                objM60210 = null;
                            }
                            String str = (String) objM60210;
                            if (str != null) {
                                viewStructure.setId(i5, null, null, str);
                            }
                            Object objM60211 = c3263.m6027(AbstractC2771.f9231);
                            if (objM60211 == null) {
                                objM60211 = null;
                            }
                            if (((Boolean) objM60211) != null) {
                                viewStructure.setClassName("android.widget.ViewGroup");
                            }
                            Object objM60212 = c3263.m6027(AbstractC2771.f9198);
                            if (objM60212 == null) {
                                objM60212 = null;
                            }
                            List list = (List) objM60212;
                            if (list != null) {
                                viewStructure.setClassName("android.widget.TextView");
                                viewStructure.setText(AbstractC0844.m1757(list, "\n", null, 62));
                            }
                            Object objM60213 = c3263.m6027(AbstractC2771.f9219);
                            if (objM60213 == null) {
                                objM60213 = null;
                            }
                            C1249 c1249 = (C1249) objM60213;
                            if (c1249 != null) {
                                viewStructure.setClassName("android.widget.EditText");
                                viewStructure.setText(c1249);
                            }
                            Object objM60214 = c3263.m6027(AbstractC2771.f9213);
                            if (objM60214 == null) {
                                objM60214 = null;
                            }
                            List list2 = (List) objM60214;
                            if (list2 != null) {
                                viewStructure.setContentDescription(AbstractC0844.m1757(list2, "\n", null, 62));
                            }
                            Object objM60215 = c3263.m6027(AbstractC2771.f9196);
                            if (objM60215 == null) {
                                objM60215 = null;
                            }
                            C2155 c2155 = (C2155) objM60215;
                            if (c2155 != null && (strM7042 = AbstractC3925.m7042(c2155.f7116)) != null) {
                                viewStructure.setClassName(strM7042);
                            }
                            C3828 c3828M7037 = AbstractC3925.m7037(c2542);
                            if (c3828M7037 != null) {
                                C2537 c2537 = c3828M7037.f12697;
                                C3564 c3564 = c2537.f8428;
                                InterfaceC2880 interfaceC2880 = c2537.f8434;
                                viewStructure.setTextStyle(interfaceC2880.mo754() * interfaceC2880.mo746() * C5023.m8438(c3564.f11803.f1987), 0, 0, 0);
                            }
                            AbstractC1311 abstractC1311M5765 = c3129.m5765();
                            if (abstractC1311M5765 == null) {
                                c2793M5764 = C2793.f9340;
                            } else {
                                AbstractC1311 abstractC1311 = abstractC1311M5765.mo2787().f17786 ? abstractC1311M5765 : null;
                                if (abstractC1311 != null) {
                                    c2793M5764 = c3129.m5764(abstractC1311);
                                } else {
                                    c2793M5764 = C2793.f9340;
                                }
                            }
                            float f = c2793M5764.f9343;
                            float f2 = c2793M5764.f9342;
                            viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (c2793M5764.f9341 - f), (int) (c2793M5764.f9344 - f2));
                            c2391 = c2392;
                        }
                    }
                } else {
                    c2391 = null;
                }
            } else {
                c2391 = null;
            }
            if (c2391 != null) {
                this.f14267.add(new C0359(i3, this.f14270, 1, c2391));
            }
            List listM5756 = C3129.m5756(4, c3129);
            int size = listM5756.size();
            int i6 = 0;
            while (i4 < size) {
                Object obj = listM5756.get(i4);
                if (m7610().m9572(((C3129) obj).f10473)) {
                    m7615(i6, (C3129) obj);
                    i6++;
                }
                i4++;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m7616(int i, String str) {
        C5002 c5002;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (c5002 = this.f14266) != null) {
            AutofillId autofillIdM8394 = c5002.m8394(i);
            if (autofillIdM8394 == null) {
                throw AbstractC3761.m6633("Invalid content capture ID");
            }
            if (i2 >= 29) {
                AbstractC5183.m8796(AbstractC2875.m5448(c5002.f16550), autofillIdM8394, str);
            }
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m7617(C3129 c3129) {
        if (m7611()) {
            this.f14267.add(new C0359(c3129.f10473, this.f14270, 2, null));
            List listM5756 = C3129.m5756(4, c3129);
            int size = listM5756.size();
            for (int i = 0; i < size; i++) {
                m7617((C3129) listM5756.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m7618() {
        C5002 c5002 = this.f14266;
        if (c5002 == null) {
            return;
        }
        Object obj = c5002.f16550;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f14267;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0359 c0359 = (C0359) arrayList.get(i);
            int iM6632 = AbstractC3761.m6632(c0359.f1300);
            if (iM6632 == 0) {
                C2391 c2391 = c0359.f1303;
                if (c2391 != null) {
                    ViewStructure viewStructure = (ViewStructure) c2391.f7924;
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC5183.m8785(AbstractC2875.m5448(obj), viewStructure);
                    }
                }
            } else {
                if (iM6632 != 1) {
                    C1078.m2275();
                    return;
                }
                AutofillId autofillIdM8394 = c5002.m8394(c0359.f1302);
                if (autofillIdM8394 != null && Build.VERSION.SDK_INT >= 29) {
                    AbstractC5183.m8786(AbstractC2875.m5448(obj), autofillIdM8394);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC5183.m8788(AbstractC2875.m5448(obj), ((View) c5002.f16551).getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
