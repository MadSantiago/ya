package p000;

/* JADX INFO: renamed from: ۦٍؔٗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3782 {

    /* JADX INFO: renamed from: ۥؗ */
    public final EnumC5504 f12564;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f12565;

    /* JADX INFO: renamed from: ۥّ */
    public String f12566;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0971 f12567;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0390 f12568;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3782[] f12569;

    /* JADX INFO: renamed from: ۦۙ */
    public String f12570;

    public C3782(C0390 c0390, C0971 c0971, EnumC5504 enumC5504, C3782[] c3782Arr) {
        this.f12568 = c0390;
        this.f12567 = c0971;
        this.f12564 = enumC5504;
        this.f12569 = c3782Arr;
        int iOrdinal = enumC5504.ordinal();
        if (c3782Arr != null) {
            C3782 c3782 = c3782Arr[iOrdinal];
            if (c3782 == null && c3782 == this) {
                return;
            }
            c3782Arr[iOrdinal] = this;
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m6682(byte b) {
        if (this.f12565) {
            m6686(String.valueOf((int) b));
        } else {
            this.f12568.mo909(b);
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m6683() {
        C0390 c0390 = this.f12568;
        c0390.getClass();
        c0390.f1448 = false;
        c0390.m904(this.f12564.f18174);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m6684(double d) {
        if (this.f12565) {
            m6686(String.valueOf(d));
        } else {
            ((C0322) this.f12568.f1447).m686(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new C2770(AbstractC3801.m6777(Double.valueOf(d), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m6685(InterfaceC0103 interfaceC0103, int i) {
        int iOrdinal = this.f12564.ordinal();
        C0390 c0390 = this.f12568;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!c0390.f1448) {
                c0390.m904(',');
            }
            c0390.m903();
            return;
        }
        if (iOrdinal == 2) {
            if (c0390.f1448) {
                this.f12565 = true;
                c0390.m903();
                return;
            }
            if (i % 2 == 0) {
                c0390.m904(',');
                c0390.m903();
            } else {
                c0390.m904(':');
                c0390.m913();
                z = false;
            }
            this.f12565 = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!c0390.f1448) {
                c0390.m904(',');
            }
            c0390.m903();
            AbstractC1605.m3352(this.f12567, interfaceC0103);
            m6686(interfaceC0103.mo184(i));
            c0390.m904(':');
            c0390.m913();
            return;
        }
        if (i == 0) {
            this.f12565 = true;
        }
        if (i == 1) {
            c0390.m904(',');
            c0390.m913();
            this.f12565 = false;
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public final void m6686(String str) {
        this.f12568.mo911(str);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m6687(InterfaceC0103 interfaceC0103, int i, String str) {
        m6685(interfaceC0103, i);
        m6686(str);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m6688() {
        return false;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6689(boolean z) {
        if (this.f12565) {
            m6686(String.valueOf(z));
        } else {
            ((C0322) this.f12568.f1447).m686(String.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final C3782 m6690(InterfaceC0103 interfaceC0103) {
        boolean zM5818 = AbstractC3143.m5818(interfaceC0103);
        EnumC5504 enumC5504 = this.f12564;
        C0971 c0971 = this.f12567;
        C0390 c3473 = this.f12568;
        if (zM5818) {
            if (!(c3473 instanceof C3792)) {
                c3473 = new C3792((C0322) c3473.f1447, this.f12565);
            }
            return new C3782(c3473, c0971, enumC5504, null);
        }
        if (interfaceC0103.mo185() && interfaceC0103.equals(AbstractC0569.f2043)) {
            if (!(c3473 instanceof C3473)) {
                c3473 = new C3473((C0322) c3473.f1447, this.f12565);
            }
            return new C3782(c3473, c0971, enumC5504, null);
        }
        if (this.f12566 != null) {
            this.f12570 = interfaceC0103.mo186();
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C3782 m6691(InterfaceC0103 interfaceC0103) {
        C3782 c3782;
        C0971 c0971 = this.f12567;
        EnumC5504 enumC5504M8146 = C4773.m8146(c0971, interfaceC0103);
        char c = enumC5504M8146.f18175;
        C0390 c0390 = this.f12568;
        c0390.m904(c);
        c0390.f1448 = true;
        String str = this.f12566;
        if (str != null) {
            String strMo186 = this.f12570;
            if (strMo186 == null) {
                strMo186 = interfaceC0103.mo186();
            }
            c0390.m903();
            m6686(str);
            c0390.m904(':');
            m6686(strMo186);
            this.f12566 = null;
            this.f12570 = null;
        }
        if (this.f12564 == enumC5504M8146) {
            return this;
        }
        C3782[] c3782Arr = this.f12569;
        return (c3782Arr == null || (c3782 = c3782Arr[enumC5504M8146.ordinal()]) == null) ? new C3782(c0390, c0971, enumC5504M8146, c3782Arr) : c3782;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m6692(char c) {
        m6686(String.valueOf(c));
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m6693() {
        this.f12568.m907("null");
    }

    /* JADX INFO: renamed from: ۦٌ */
    public void m6694(InterfaceC0103 interfaceC0103, int i, InterfaceC4734 interfaceC4734, Object obj) {
        m6685(interfaceC0103, i);
        if (interfaceC4734.mo193().mo187()) {
            m6701(interfaceC4734, obj);
        } else if (obj == null) {
            m6693();
        } else {
            m6701(interfaceC4734, obj);
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m6695(int i) {
        if (this.f12565) {
            m6686(String.valueOf(i));
        } else {
            this.f12568.mo905(i);
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final C3782 m6696(C3907 c3907, int i) {
        m6685(c3907, i);
        return m6690(c3907.mo190(i));
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m6697(long j) {
        if (this.f12565) {
            m6686(String.valueOf(j));
        } else {
            this.f12568.mo914(j);
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m6698(float f) {
        if (this.f12565) {
            m6686(String.valueOf(f));
        } else {
            ((C0322) this.f12568.f1447).m686(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw new C2770(AbstractC3801.m6777(Float.valueOf(f), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m6699(InterfaceC0103 interfaceC0103, int i, InterfaceC4734 interfaceC4734, Object obj) {
        m6685(interfaceC0103, i);
        m6701(interfaceC4734, obj);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m6700(short s) {
        if (this.f12565) {
            m6686(String.valueOf((int) s));
        } else {
            this.f12568.mo912(s);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX INFO: renamed from: ۦۨ */
    public final void m6701(InterfaceC4734 interfaceC4734, Object obj) {
        String strM7175;
        C0971 c0971 = this.f12567;
        C3510 c3510 = c0971.f3430;
        boolean z = interfaceC4734 instanceof C1527;
        int i = c3510.f11622;
        if (!z) {
            int iM6632 = AbstractC3761.m6632(i);
            if (iM6632 != 0) {
                if (iM6632 == 1) {
                    AbstractC0487 abstractC0487Mo183 = interfaceC4734.mo193().mo183();
                    if (AbstractC3831.m6874(abstractC0487Mo183, C3626.f12098) || AbstractC3831.m6874(abstractC0487Mo183, C3626.f12101)) {
                        strM7175 = AbstractC4009.m7175(c0971, interfaceC4734.mo193());
                    }
                } else if (iM6632 != 2) {
                    C1078.m2275();
                    return;
                }
            }
            strM7175 = null;
        } else if (i != 1) {
            strM7175 = AbstractC4009.m7175(c0971, interfaceC4734.mo193());
        } else {
            strM7175 = null;
        }
        if (z) {
            C1527 c1527 = (C1527) interfaceC4734;
            if (obj == null) {
                C2316.m4357(c1527.mo193(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            } else {
                AbstractC0186.m442(c1527, this, obj);
                throw null;
            }
        }
        if (strM7175 != null) {
            InterfaceC0103 interfaceC0103Mo193 = interfaceC4734.mo193();
            AbstractC1605.m3352(c0971, interfaceC0103Mo193);
            if (AbstractC0186.m424(interfaceC0103Mo193).contains(strM7175)) {
                String strMo186 = interfaceC4734.mo193().mo186();
                String strMo187 = interfaceC4734.mo193().mo186();
                String strM8669 = (c3510.f11622 == 2 && AbstractC3831.m6874(strMo186, strMo187)) ? "in ALL_JSON_OBJECTS class discriminator mode" : AbstractC5078.m8669('\'', "as base class '", strMo186);
                StringBuilder sb = new StringBuilder("Class '");
                sb.append(strMo187);
                sb.append("' cannot be serialized ");
                sb.append(strM8669);
                sb.append(" because it has property name that conflicts with JSON class discriminator '");
                throw new C2770(AbstractC3761.m6621(sb, strM7175, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            AbstractC0487 abstractC0487Mo184 = interfaceC4734.mo193().mo183();
            if (abstractC0487Mo184 instanceof C0907) {
                C1078.m2276("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            }
            if (abstractC0487Mo184 instanceof C2204) {
                C1078.m2276("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            } else if (abstractC0487Mo184 instanceof C5384) {
                C1078.m2276("Actual serializer for polymorphic cannot be polymorphic itself");
                return;
            } else {
                String strMo188 = interfaceC4734.mo193().mo186();
                this.f12566 = strM7175;
                this.f12570 = strMo188;
            }
        }
        interfaceC4734.mo197(this, obj);
    }
}
