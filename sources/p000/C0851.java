package p000;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: ۥًٕؖؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0851 implements InterfaceC1263 {

    /* JADX INFO: renamed from: ۥؓ */
    public final C0863 f3140;

    /* JADX INFO: renamed from: ۥؖ */
    public final C3262 f3141;

    /* JADX INFO: renamed from: ۥً */
    public int f3142;

    /* JADX INFO: renamed from: ۥَ */
    public int f3143;

    /* JADX INFO: renamed from: ۥْ */
    public InterfaceC3237 f3144;

    /* JADX INFO: renamed from: ۥٓ */
    public int f3145;

    /* JADX INFO: renamed from: ۥٖ */
    public final C3262 f3146;

    /* JADX INFO: renamed from: ۥٙ */
    public final C3753 f3147;

    /* JADX INFO: renamed from: ۥۖ */
    public final C0329 f3148;

    /* JADX INFO: renamed from: ۥۧ */
    public int f3149;

    /* JADX INFO: renamed from: ۦٕ */
    public final C3262 f3150;

    /* JADX INFO: renamed from: ۦٗ */
    public final C3262 f3151;

    /* JADX INFO: renamed from: ۦٚ */
    public final String f3152;

    /* JADX INFO: renamed from: ۦۛ */
    public final C4509 f3153;

    /* JADX INFO: renamed from: ۦ۟ */
    public AbstractC2109 f3154;

    /* JADX INFO: renamed from: ۦۨ */
    public final C0605 f3155;

    public C0851(C0605 c0605, InterfaceC3237 interfaceC3237) {
        this.f3155 = c0605;
        this.f3144 = interfaceC3237;
        long[] jArr = AbstractC5064.f16815;
        this.f3146 = new C3262();
        this.f3151 = new C3262();
        this.f3153 = new C4509(this);
        this.f3148 = new C0329(this);
        this.f3150 = new C3262();
        this.f3147 = new C3753();
        this.f3141 = new C3262();
        this.f3140 = new C0863(new Object[16]);
        this.f3152 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m1801(C1325 c1325) {
        C3639 c3639;
        C2166 c2166 = c1325.f4576;
        if (c2166 != null) {
            c2166.f7149.set(EnumC4901.f16164);
            C0175 c0175 = c2166.f7155;
            if (((C3639) c0175.f660).m6494()) {
                c3639 = (C3639) c0175.f660;
                C3639 c36310 = AbstractC5705.f18789;
                c0175.f660 = new C3639();
                ((C0863) c0175.f650).m1851();
            } else {
                c3639 = null;
            }
            c0175.m367();
            C1946 c1946 = c2166.f7150;
            c1946.f6421 = null;
            if (c3639 != null) {
                c1946.f6426.f658 = c3639;
                c1946.f6431 = 2;
            }
            c1325.f4576 = null;
            C1946 c1947 = c1325.f4574;
            if (c1947 != null) {
                c1947.m3825();
            }
            c1325.f4574 = null;
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0712 m1802(Object obj) {
        return !this.f3155.m1348() ? new C5333() : new C1214(this, obj);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m1803(Object obj) {
        m1811();
        C0605 c0605 = (C0605) this.f3150.m6026(obj);
        C0605 c0606 = this.f3155;
        if (c0605 != null) {
            if (this.f3142 <= 0) {
                AbstractC3480.m6278("No pre-composed items to dispose");
            }
            int iM1849 = ((C0863) ((C3482) c0606.m1368()).f11560).m1849(c0605);
            if (iM1849 < ((C0863) ((C3482) c0606.m1368()).f11560).f3180 - this.f3142) {
                AbstractC3480.m6278("Item is not in pre-composed item range");
            }
            this.f3149++;
            this.f3142--;
            C1325 c1325 = (C1325) this.f3146.m6027(c0605);
            if (c1325 != null) {
                m1801(c1325);
            }
            int i = (((C0863) ((C3482) c0606.m1368()).f11560).f3180 - this.f3142) - this.f3149;
            m1808(iM1849, i);
            m1805(i);
        }
        if (this.f3140.m1844(obj)) {
            C0605.m1312(c0606, true, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // p000.InterfaceC1263
    /* JADX INFO: renamed from: ۥّ */
    public final void mo1323() {
        C1946 c1946;
        C0605 c0605 = this.f3155;
        c0605.f2245 = true;
        C3262 c3262 = this.f3146;
        Object[] objArr = c3262.f10944;
        long[] jArr = c3262.f10948;
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
                        if ((255 & j) < 128 && (c1946 = ((C1325) objArr[(i << 3) + i3]).f4574) != null) {
                            c1946.m3825();
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
        c0605.m1328();
        c0605.f2245 = false;
        c3262.m6020();
        this.f3151.m6020();
        this.f3142 = 0;
        this.f3149 = 0;
        this.f3150.m6020();
        m1811();
    }

    @Override // p000.InterfaceC1263
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo1335() {
        m1809(true);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m1804(C1325 c1325, boolean z) {
        C2166 c2166 = c1325.f4576;
        if (c2166 != null) {
            AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
            InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
            AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
            try {
                C0605 c0605 = this.f3155;
                c0605.f2245 = true;
                if (z) {
                    while (!c2166.m4220()) {
                        try {
                            c2166.m4221(new C5028(25));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                c2166.m4223();
                c1325.f4576 = null;
                c0605.f2245 = false;
                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            } catch (Throwable th2) {
                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m1805(int i) {
        boolean z;
        boolean z2 = false;
        this.f3149 = 0;
        List listM1368 = this.f3155.m1368();
        C3482 c3482 = (C3482) listM1368;
        int i2 = (((C0863) c3482.f11560).f3180 - this.f3142) - 1;
        if (i <= i2) {
            this.f3147.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    ((C1165) this.f3147.f12486).m2480(((C1325) this.f3146.m6027((C0605) c3482.get(i3))).f4579);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f3144.mo2760(this.f3147);
            AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
            InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
            AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
            z = false;
            while (i2 >= i) {
                try {
                    C0605 c0605 = (C0605) ((C3482) listM1368).get(i2);
                    C1325 c1325 = (C1325) this.f3146.m6027(c0605);
                    Object obj = c1325.f4579;
                    if (((C1165) this.f3147.f12486).m2475(obj)) {
                        this.f3149++;
                        if (((Boolean) c1325.f4581.getValue()).booleanValue()) {
                            C1233 c1233 = c0605.f2261;
                            c1233.f4252.f7776 = 3;
                            C2921 c2921 = c1233.f4240;
                            if (c2921 != null) {
                                c2921.f9815 = 3;
                            }
                            m1806(c1325, false);
                            if (c1325.f4578) {
                                z = true;
                            }
                        }
                    } else {
                        C0605 c0606 = this.f3155;
                        c0606.f2245 = true;
                        this.f3146.m6026(c0605);
                        C1946 c1946 = c1325.f4574;
                        if (c1946 != null) {
                            c1946.m3825();
                        }
                        this.f3155.m1330(i2, 1);
                        c0606.f2245 = false;
                    }
                    this.f3151.m6026(obj);
                    i2--;
                } catch (Throwable th) {
                    AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                    throw th;
                }
            }
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
        } else {
            z = false;
        }
        if (z) {
            synchronized (AbstractC1538.f5203) {
                C3639 c3639 = AbstractC1538.f5210.f16713;
                if (c3639 != null && c3639.m6494()) {
                    z2 = true;
                }
            }
            if (z2) {
                AbstractC1538.m3269();
            }
        }
        m1811();
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m1806(C1325 c1325, boolean z) {
        C1946 c1946;
        if (z || !c1325.f4578) {
            c1325.f4581 = AbstractC2774.m5183(Boolean.FALSE);
        } else {
            c1325.f4581.setValue(Boolean.FALSE);
        }
        if (c1325.f4576 != null) {
            m1801(c1325);
            return;
        }
        if (z) {
            C1946 c1947 = c1325.f4574;
            if (c1947 != null) {
                c1947.m3824();
                return;
            }
            return;
        }
        InterfaceC3851 interfaceC3851M9772getOutOfFrameExecutor = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(this.f3155)).m9772getOutOfFrameExecutor();
        if (interfaceC3851M9772getOutOfFrameExecutor == null) {
            if (c1325.f4578 || (c1946 = c1325.f4574) == null) {
                return;
            }
            c1946.m3824();
            return;
        }
        C5285 c5285 = new C5285(13, c1325);
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = (ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC3851M9772getOutOfFrameExecutor;
        C5219 c5219 = viewTreeObserverOnGlobalLayoutListenerC0850.f3084;
        boolean zIsEmpty = c5219.isEmpty();
        c5219.addLast(c5285);
        if (zIsEmpty) {
            Handler handler = viewTreeObserverOnGlobalLayoutListenerC0850.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(viewTreeObserverOnGlobalLayoutListenerC0850.f3116);
            } else {
                C1078.m2272("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x0120), top: B:79:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x0120), top: B:79:0x0076 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۦٌ */
    public final void m1807(C0605 c0605, Object obj, boolean z, InterfaceC5731 interfaceC5731) {
        boolean z2;
        C1946 c1946;
        C3262 c3262 = this.f3146;
        Object objM6027 = c3262.m6027(c0605);
        Object obj2 = objM6027;
        if (objM6027 == null) {
            C0857 c0857 = AbstractC0326.f1218;
            C1325 c1325 = new C1325();
            c1325.f4579 = obj;
            c1325.f4577 = c0857;
            c1325.f4574 = null;
            c1325.f4581 = AbstractC2774.m5183(Boolean.TRUE);
            c3262.m6023(c0605, c1325);
            obj2 = c1325;
        }
        C1325 c1326 = (C1325) obj2;
        int i = 1;
        boolean z3 = c1326.f4577 != interfaceC5731;
        if (c1326.f4576 != null) {
            if (z3) {
                m1801(c1326);
            } else if (z) {
                return;
            } else {
                m1804(c1326, true);
            }
        }
        C1946 c1947 = c1326.f4574;
        if (c1947 != null) {
            synchronized (c1947.f6420) {
                z2 = c1947.f6427.f10945 > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || c1326.f4580) {
            c1326.f4577 = interfaceC5731;
            if (c1326.f4576 != null) {
                AbstractC3480.m6279("new subcompose call while paused composition is still active");
            }
            AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
            InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
            AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
            try {
                C0605 c0606 = this.f3155;
                c0606.f2245 = true;
                C1946 c1948 = c1326.f4574;
                AbstractC2109 abstractC2109 = this.f3154;
                if (abstractC2109 == null) {
                    AbstractC3480.m6277("parent composition reference not set");
                    throw new C1228(5);
                }
                if (c1948 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = AbstractC2433.f8099;
                        c1946 = new C1946(abstractC2109, new C1326(c0605));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = AbstractC2433.f8099;
                        c1946 = new C1946(abstractC2109, new C1326(c0605));
                    }
                    c1948 = c1946;
                } else {
                    if (c1948.f6431 == 3) {
                        if (z) {
                            ViewGroup.LayoutParams layoutParams3 = AbstractC2433.f8099;
                            c1946 = new C1946(abstractC2109, new C1326(c0605));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = AbstractC2433.f8099;
                            c1946 = new C1946(abstractC2109, new C1326(c0605));
                        }
                        c1948 = c1946;
                    }
                }
                c1326.f4574 = c1948;
                InterfaceC5731 c0858 = c1326.f4577;
                if (((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(this.f3155)).m9772getOutOfFrameExecutor() != null) {
                    c1326.f4578 = false;
                } else {
                    c1326.f4578 = true;
                    c0858 = new C0857(1524156494, new C2732(i, c1326, c0858), true);
                }
                if (z) {
                    if (c1326.f4575) {
                        c1948.m3829();
                        c1948.m3815();
                        c1326.f4576 = c1948.m3830(true, c0858);
                    } else {
                        c1326.f4576 = c1948.m3830(c1948.m3829(), c0858);
                    }
                } else if (c1326.f4575) {
                    c1948.m3829();
                    c1948.m3815();
                    C5362 c5362 = c1948.f6429;
                    c5362.f17644 = 0;
                    c5362.f17655 = true;
                    c1948.f6437.mo1000(c1948, c0858);
                    c5362.m8960();
                } else {
                    c1948.m3809(c0858);
                }
                c1326.f4575 = false;
                c0606.f2245 = false;
                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                c1326.f4580 = false;
            } catch (Throwable th) {
                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m1808(int i, int i2) {
        C0605 c0605 = this.f3155;
        c0605.f2245 = true;
        c0605.m1355(i, i2, 1);
        c0605.f2245 = false;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m1809(boolean z) {
        this.f3142 = 0;
        this.f3150.m6020();
        List listM1368 = this.f3155.m1368();
        int i = ((C0863) ((C3482) listM1368).f11560).f3180;
        if (this.f3149 != i) {
            this.f3149 = i;
            AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
            InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
            AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    C0605 c0605 = (C0605) ((C3482) listM1368).get(i2);
                    C1325 c1325 = (C1325) this.f3146.m6027(c0605);
                    if (c1325 != null && ((Boolean) c1325.f4581.getValue()).booleanValue()) {
                        C1233 c1233 = c0605.f2261;
                        c1233.f4252.f7776 = 3;
                        C2921 c2921 = c1233.f4240;
                        if (c2921 != null) {
                            c2921.f9815 = 3;
                        }
                        m1806(c1325, z);
                        c1325.f4579 = AbstractC0186.f679;
                    }
                } catch (Throwable th) {
                    AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                    throw th;
                }
            }
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            this.f3151.m6020();
        }
        m1811();
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m1810(Object obj, InterfaceC5731 interfaceC5731, boolean z) {
        C0605 c0605 = this.f3155;
        if (c0605.m1348()) {
            m1811();
            if (this.f3151.m6015(obj)) {
                return;
            }
            this.f3141.m6026(obj);
            C3262 c3262 = this.f3150;
            Object objM6027 = c3262.m6027(obj);
            if (objM6027 == null) {
                objM6027 = m1812(obj);
                if (objM6027 != null) {
                    m1808(((C0863) ((C3482) c0605.m1368()).f11560).m1849(objM6027), ((C0863) ((C3482) c0605.m1368()).f11560).f3180);
                    this.f3142++;
                } else {
                    int i = ((C0863) ((C3482) c0605.m1368()).f11560).f3180;
                    C0605 c0606 = new C0605(2);
                    c0605.f2245 = true;
                    c0605.m1343(i, c0606);
                    c0605.f2245 = false;
                    this.f3142++;
                    objM6027 = c0606;
                }
                c3262.m6023(obj, objM6027);
            }
            m1807((C0605) objM6027, obj, z, interfaceC5731);
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m1811() {
        int i = ((C0863) ((C3482) this.f3155.m1368()).f11560).f3180;
        C3262 c3262 = this.f3146;
        if (c3262.f10945 != i) {
            AbstractC3480.m6279("Inconsistency between the count of nodes tracked by the state (" + c3262.f10945 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.f3149) - this.f3142 < 0) {
            StringBuilder sbM8680 = AbstractC5078.m8680(i, "Incorrect state. Total children ", ". Reusable children ");
            sbM8680.append(this.f3149);
            sbM8680.append(". Precomposed children ");
            sbM8680.append(this.f3142);
            AbstractC3480.m6279(sbM8680.toString());
        }
        C3262 c3263 = this.f3150;
        if (c3263.f10945 == this.f3142) {
            return;
        }
        AbstractC3480.m6279("Incorrect state. Precomposed children " + this.f3142 + ". Map size " + c3263.f10945);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final C0605 m1812(Object obj) {
        C3262 c3262;
        int i;
        if (this.f3149 == 0) {
            return null;
        }
        C3482 c3482 = (C3482) this.f3155.m1368();
        int i2 = ((C0863) c3482.f11560).f3180 - this.f3142;
        int i3 = i2 - this.f3149;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            c3262 = this.f3146;
            if (i5 < i3) {
                i = -1;
                break;
            }
            if (AbstractC3831.m6874(((C1325) c3262.m6027((C0605) c3482.get(i5))).f4579, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                C1325 c1325 = (C1325) c3262.m6027((C0605) c3482.get(i4));
                Object obj2 = c1325.f4579;
                if (obj2 == AbstractC0186.f679 || this.f3144.mo2768(obj, obj2)) {
                    c1325.f4579 = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            m1808(i5, i3);
        }
        this.f3149--;
        C0605 c0605 = (C0605) c3482.get(i3);
        C1325 c1326 = (C1325) c3262.m6027(c0605);
        c1326.f4581 = AbstractC2774.m5183(Boolean.TRUE);
        c1326.f4575 = true;
        c1326.f4580 = true;
        return c0605;
    }
}
