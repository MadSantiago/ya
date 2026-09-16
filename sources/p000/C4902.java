package p000;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: ۦۖؓۙؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4902 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f16166;

    /* JADX INFO: renamed from: ۥُ */
    public Object f16167;

    /* JADX INFO: renamed from: ۥۗ */
    public int f16168;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f16169;

    /* JADX INFO: renamed from: ۦؑ */
    public int f16170;

    public C4902(AbstractC2758 abstractC2758) {
        this.f16169 = 1;
        this.f16170 = 0;
        Charset charset = AbstractC3576.f11899;
        this.f16167 = abstractC2758;
        abstractC2758.f9135 = this;
    }

    /* JADX INFO: renamed from: ۥۥ */
    public static final void m8240(int i) throws C5463 {
        if ((i & 7) == 0) {
            return;
        }
        C2316.m4358("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: ۦۧ */
    public static final void m8241(int i) throws C5463 {
        if ((i & 3) == 0) {
            return;
        }
        C2316.m4358("Failed to parse the message.");
    }

    public String toString() {
        switch (this.f16169) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return "";
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
            default:
                return super.toString();
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.f16168;
                sb.append(i);
                sb.append('-');
                C3828 c3828 = (C3828) this.f16167;
                sb.append(AbstractC5078.m8683(AbstractC5378.m9043(c3828, i)));
                sb.append(',');
                int i2 = this.f16166;
                sb.append(i2);
                sb.append('-');
                sb.append(AbstractC5078.m8683(AbstractC5378.m9043(c3828, i2)));
                sb.append("), prevOffset=");
                return AbstractC3761.m6638(sb, this.f16170, ')');
        }
    }

    /* JADX INFO: renamed from: ۥؓ */
    public void m8242(int i) throws C3406 {
        if (((AbstractC2758) this.f16167).mo5048() != i) {
            throw C3406.m6169();
        }
    }

    /* JADX INFO: renamed from: ۥؔ */
    public void m8243(InterfaceC5083 interfaceC5083) throws C5463 {
        int iMo4616;
        int iMo4617;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        boolean z = interfaceC5083 instanceof C2667;
        int i = this.f16168;
        if (z) {
            C2667 c2667 = (C2667) interfaceC5083;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo4599 = abstractC4650.mo4599() + abstractC4650.mo4593();
                do {
                    c2667.m4969(abstractC4650.mo4593());
                } while (abstractC4650.mo4599() < iMo4599);
                m8267(iMo4599);
                return;
            }
            do {
                c2667.m4969(abstractC4650.mo4593());
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4617 = abstractC4650.mo4616();
                }
            } while (iMo4617 == this.f16168);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo45910 = abstractC4650.mo4599() + abstractC4650.mo4593();
                do {
                    interfaceC5083.add(Integer.valueOf(abstractC4650.mo4593()));
                } while (abstractC4650.mo4599() < iMo45910);
                m8267(iMo45910);
                return;
            }
            do {
                interfaceC5083.add(Integer.valueOf(abstractC4650.mo4593()));
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4616 = abstractC4650.mo4616();
                }
            } while (iMo4616 == this.f16168);
            iMo4617 = iMo4616;
        }
        this.f16170 = iMo4617;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public void m8244(InterfaceC4997 interfaceC4997) throws C3406 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int i = this.f16168 & 7;
        if (i == 0) {
            do {
                ((C2645) interfaceC4997).add(Long.valueOf(abstractC2758.mo5052()));
                if (abstractC2758.mo5040()) {
                    return;
                } else {
                    iMo5039 = abstractC2758.mo5039();
                }
            } while (iMo5039 == this.f16168);
            this.f16170 = iMo5039;
            return;
        }
        if (i != 2) {
            throw C3406.m6170();
        }
        int iMo5048 = abstractC2758.mo5048() + abstractC2758.mo5038();
        do {
            ((C2645) interfaceC4997).add(Long.valueOf(abstractC2758.mo5052()));
        } while (abstractC2758.mo5048() < iMo5048);
        m8242(iMo5048);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public int m8245() {
        return this.f16170 - this.f16166;
    }

    /* JADX INFO: renamed from: ۥؙ */
    public Object m8246(EnumC4646 enumC4646, Class cls, C2955 c2955) throws C5463 {
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        EnumC4646 enumC4647 = EnumC4646.f15324;
        switch (enumC4646.ordinal()) {
            case 0:
                m8260(1);
                return Double.valueOf(abstractC4650.mo4627());
            case 1:
                m8260(5);
                return Float.valueOf(abstractC4650.mo4626());
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                m8260(0);
                return Long.valueOf(abstractC4650.mo4602());
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                m8260(0);
                return Long.valueOf(abstractC4650.mo4601());
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                m8260(0);
                return Integer.valueOf(abstractC4650.mo4598());
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                m8260(1);
                return Long.valueOf(abstractC4650.mo4604());
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                m8260(5);
                return Integer.valueOf(abstractC4650.mo4621());
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                m8260(0);
                return Boolean.valueOf(abstractC4650.mo4625());
            case 8:
                m8260(2);
                return abstractC4650.mo4619();
            case 9:
            default:
                C1078.m2272("unsupported field type.");
                return null;
            case 10:
                m8260(2);
                InterfaceC0759 interfaceC0759M8330 = C4946.f16366.m8330(cls);
                AbstractC5212 abstractC5212Mo1651 = interfaceC0759M8330.mo1651();
                m8266(abstractC5212Mo1651, interfaceC0759M8330, c2955);
                interfaceC0759M8330.mo1654(abstractC5212Mo1651);
                return abstractC5212Mo1651;
            case 11:
                return m8294();
            case 12:
                m8260(0);
                return Integer.valueOf(abstractC4650.mo4593());
            case 13:
                m8260(0);
                return Integer.valueOf(abstractC4650.mo4611());
            case 14:
                m8260(5);
                return Integer.valueOf(abstractC4650.mo4597());
            case 15:
                m8260(1);
                return Long.valueOf(abstractC4650.mo4622());
            case 16:
                m8260(0);
                return Integer.valueOf(abstractC4650.mo4603());
            case 17:
                m8260(0);
                return Long.valueOf(abstractC4650.mo4608());
        }
    }

    /* JADX INFO: renamed from: ۥؚ */
    public void m8247(Object obj, InterfaceC0759 interfaceC0759, C2955 c2955) {
        int i = this.f16166;
        this.f16166 = ((this.f16168 >>> 3) << 3) | 4;
        try {
            interfaceC0759.mo1655(obj, this, c2955);
            if (this.f16168 != this.f16166) {
                throw new C5463("Failed to parse the message.");
            }
            this.f16166 = i;
        } catch (Throwable th) {
            this.f16166 = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public boolean m8248() {
        int i;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        if (abstractC2758.mo5040() || (i = this.f16168) == this.f16166) {
            return false;
        }
        return abstractC2758.mo5041(i);
    }

    /* JADX INFO: renamed from: ۥَ */
    public void m8249(InterfaceC4997 interfaceC4997) throws C3406 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int i = this.f16168 & 7;
        if (i == 0) {
            do {
                ((C2645) interfaceC4997).add(Long.valueOf(abstractC2758.mo5042()));
                if (abstractC2758.mo5040()) {
                    return;
                } else {
                    iMo5039 = abstractC2758.mo5039();
                }
            } while (iMo5039 == this.f16168);
            this.f16170 = iMo5039;
            return;
        }
        if (i != 2) {
            throw C3406.m6170();
        }
        int iMo5048 = abstractC2758.mo5048() + abstractC2758.mo5038();
        do {
            ((C2645) interfaceC4997).add(Long.valueOf(abstractC2758.mo5042()));
        } while (abstractC2758.mo5048() < iMo5048);
        m8242(iMo5048);
    }

    /* JADX INFO: renamed from: ۥُ */
    public int m8250(int i) {
        return ((C0188) this.f16167).f699[this.f16166 + i];
    }

    /* JADX INFO: renamed from: ۥِ */
    public void m8251(InterfaceC5083 interfaceC5083) throws C5463 {
        int iMo4616;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        int i = this.f16168 & 7;
        if (i == 1) {
            do {
                interfaceC5083.add(Double.valueOf(abstractC4650.mo4627()));
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4616 = abstractC4650.mo4616();
                }
            } while (iMo4616 == this.f16168);
            this.f16170 = iMo4616;
            return;
        }
        if (i != 2) {
            C2316.m4361();
            return;
        }
        int iMo4593 = abstractC4650.mo4593();
        m8240(iMo4593);
        int iMo4599 = abstractC4650.mo4599() + iMo4593;
        do {
            interfaceC5083.add(Double.valueOf(abstractC4650.mo4627()));
        } while (abstractC4650.mo4599() < iMo4599);
    }

    /* JADX INFO: renamed from: ۥّ */
    public Object m8252(int i) {
        return ((C0188) this.f16167).f703[this.f16170 + i];
    }

    /* JADX INFO: renamed from: ۥْ */
    public void m8253(InterfaceC4997 interfaceC4997) throws C3406 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int i = this.f16168 & 7;
        if (i == 2) {
            int iMo5038 = abstractC2758.mo5038();
            if ((iMo5038 & 3) != 0) {
                throw new C3406("Failed to parse the message.");
            }
            int iMo5048 = abstractC2758.mo5048() + iMo5038;
            do {
                ((C2645) interfaceC4997).add(Float.valueOf(abstractC2758.mo5043()));
            } while (abstractC2758.mo5048() < iMo5048);
            return;
        }
        if (i != 5) {
            throw C3406.m6170();
        }
        do {
            ((C2645) interfaceC4997).add(Float.valueOf(abstractC2758.mo5043()));
            if (abstractC2758.mo5040()) {
                return;
            } else {
                iMo5039 = abstractC2758.mo5039();
            }
        } while (iMo5039 == this.f16168);
        this.f16170 = iMo5039;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public void m8254(InterfaceC4997 interfaceC4997) throws C3406 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int i = this.f16168 & 7;
        if (i == 0) {
            do {
                ((C2645) interfaceC4997).add(Integer.valueOf(abstractC2758.mo5044()));
                if (abstractC2758.mo5040()) {
                    return;
                } else {
                    iMo5039 = abstractC2758.mo5039();
                }
            } while (iMo5039 == this.f16168);
            this.f16170 = iMo5039;
            return;
        }
        if (i != 2) {
            throw C3406.m6170();
        }
        int iMo5048 = abstractC2758.mo5048() + abstractC2758.mo5038();
        do {
            ((C2645) interfaceC4997).add(Integer.valueOf(abstractC2758.mo5044()));
        } while (abstractC2758.mo5048() < iMo5048);
        m8242(iMo5048);
    }

    /* JADX INFO: renamed from: ۥٕ */
    public void m8255(InterfaceC5083 interfaceC5083) throws C5463 {
        int iMo4616;
        int iMo4617;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        boolean z = interfaceC5083 instanceof C2667;
        int i = this.f16168;
        if (z) {
            C2667 c2667 = (C2667) interfaceC5083;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo4599 = abstractC4650.mo4599() + abstractC4650.mo4593();
                do {
                    c2667.m4969(abstractC4650.mo4598());
                } while (abstractC4650.mo4599() < iMo4599);
                m8267(iMo4599);
                return;
            }
            do {
                c2667.m4969(abstractC4650.mo4598());
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4617 = abstractC4650.mo4616();
                }
            } while (iMo4617 == this.f16168);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo45910 = abstractC4650.mo4599() + abstractC4650.mo4593();
                do {
                    interfaceC5083.add(Integer.valueOf(abstractC4650.mo4598()));
                } while (abstractC4650.mo4599() < iMo45910);
                m8267(iMo45910);
                return;
            }
            do {
                interfaceC5083.add(Integer.valueOf(abstractC4650.mo4598()));
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4616 = abstractC4650.mo4616();
                }
            } while (iMo4616 == this.f16168);
            iMo4617 = iMo4616;
        }
        this.f16170 = iMo4617;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public void m8256(InterfaceC4997 interfaceC4997) throws C3406 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int i = this.f16168 & 7;
        if (i == 2) {
            int iMo5038 = abstractC2758.mo5038();
            if ((iMo5038 & 3) != 0) {
                throw new C3406("Failed to parse the message.");
            }
            int iMo5048 = abstractC2758.mo5048() + iMo5038;
            do {
                ((C2645) interfaceC4997).add(Integer.valueOf(abstractC2758.mo5045()));
            } while (abstractC2758.mo5048() < iMo5048);
            return;
        }
        if (i != 5) {
            throw C3406.m6170();
        }
        do {
            ((C2645) interfaceC4997).add(Integer.valueOf(abstractC2758.mo5045()));
            if (abstractC2758.mo5040()) {
                return;
            } else {
                iMo5039 = abstractC2758.mo5039();
            }
        } while (iMo5039 == this.f16168);
        this.f16170 = iMo5039;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public void m8257(InterfaceC5083 interfaceC5083) throws C5463 {
        int iMo4616;
        int iMo4617;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        boolean z = interfaceC5083 instanceof C4416;
        int i = this.f16168;
        if (z) {
            C4416 c4416 = (C4416) interfaceC5083;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo4593 = abstractC4650.mo4593();
                m8240(iMo4593);
                int iMo4599 = abstractC4650.mo4599() + iMo4593;
                do {
                    c4416.m7714(abstractC4650.mo4622());
                } while (abstractC4650.mo4599() < iMo4599);
                return;
            }
            do {
                c4416.m7714(abstractC4650.mo4622());
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4617 = abstractC4650.mo4616();
                }
            } while (iMo4617 == this.f16168);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo4594 = abstractC4650.mo4593();
                m8240(iMo4594);
                int iMo45910 = abstractC4650.mo4599() + iMo4594;
                do {
                    interfaceC5083.add(Long.valueOf(abstractC4650.mo4622()));
                } while (abstractC4650.mo4599() < iMo45910);
                return;
            }
            do {
                interfaceC5083.add(Long.valueOf(abstractC4650.mo4622()));
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4616 = abstractC4650.mo4616();
                }
            } while (iMo4616 == this.f16168);
            iMo4617 = iMo4616;
        }
        this.f16170 = iMo4617;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public void m8258(InterfaceC4997 interfaceC4997) throws C3406 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int i = this.f16168 & 7;
        if (i == 0) {
            do {
                ((C2645) interfaceC4997).add(Integer.valueOf(abstractC2758.mo5038()));
                if (abstractC2758.mo5040()) {
                    return;
                } else {
                    iMo5039 = abstractC2758.mo5039();
                }
            } while (iMo5039 == this.f16168);
            this.f16170 = iMo5039;
            return;
        }
        if (i != 2) {
            throw C3406.m6170();
        }
        int iMo5048 = abstractC2758.mo5048() + abstractC2758.mo5038();
        do {
            ((C2645) interfaceC4997).add(Integer.valueOf(abstractC2758.mo5038()));
        } while (abstractC2758.mo5048() < iMo5048);
        m8242(iMo5048);
    }

    /* JADX INFO: renamed from: ۥٛ */
    public void m8259(InterfaceC5083 interfaceC5083) throws C5463 {
        int iMo4616;
        int iMo4617;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        boolean z = interfaceC5083 instanceof C2667;
        int i = this.f16168;
        if (z) {
            C2667 c2667 = (C2667) interfaceC5083;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo4599 = abstractC4650.mo4599() + abstractC4650.mo4593();
                do {
                    c2667.m4969(abstractC4650.mo4603());
                } while (abstractC4650.mo4599() < iMo4599);
                m8267(iMo4599);
                return;
            }
            do {
                c2667.m4969(abstractC4650.mo4603());
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4617 = abstractC4650.mo4616();
                }
            } while (iMo4617 == this.f16168);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo45910 = abstractC4650.mo4599() + abstractC4650.mo4593();
                do {
                    interfaceC5083.add(Integer.valueOf(abstractC4650.mo4603()));
                } while (abstractC4650.mo4599() < iMo45910);
                m8267(iMo45910);
                return;
            }
            do {
                interfaceC5083.add(Integer.valueOf(abstractC4650.mo4603()));
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4616 = abstractC4650.mo4616();
                }
            } while (iMo4616 == this.f16168);
            iMo4617 = iMo4616;
        }
        this.f16170 = iMo4617;
    }

    /* JADX INFO: renamed from: ۥٝ */
    public void m8260(int i) {
        if ((this.f16168 & 7) == i) {
            return;
        }
        C2316.m4361();
    }

    /* JADX INFO: renamed from: ۥۖ */
    public void m8261(InterfaceC4997 interfaceC4997) throws C3406 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int i = this.f16168 & 7;
        if (i == 0) {
            do {
                ((C2645) interfaceC4997).add(Long.valueOf(abstractC2758.mo5047()));
                if (abstractC2758.mo5040()) {
                    return;
                } else {
                    iMo5039 = abstractC2758.mo5039();
                }
            } while (iMo5039 == this.f16168);
            this.f16170 = iMo5039;
            return;
        }
        if (i != 2) {
            throw C3406.m6170();
        }
        int iMo5048 = abstractC2758.mo5048() + abstractC2758.mo5038();
        do {
            ((C2645) interfaceC4997).add(Long.valueOf(abstractC2758.mo5047()));
        } while (abstractC2758.mo5048() < iMo5048);
        m8242(iMo5048);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public C3177 m8262(int i) {
        return new C3177(AbstractC5378.m9043((C3828) this.f16167, i), i, 1L);
    }

    /* JADX INFO: renamed from: ۥۘ */
    public void m8263(InterfaceC5083 interfaceC5083) throws C5463 {
        int iMo4616;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        int i = this.f16168 & 7;
        if (i == 2) {
            int iMo4593 = abstractC4650.mo4593();
            m8241(iMo4593);
            int iMo4599 = abstractC4650.mo4599() + iMo4593;
            do {
                interfaceC5083.add(Float.valueOf(abstractC4650.mo4626()));
            } while (abstractC4650.mo4599() < iMo4599);
            return;
        }
        if (i != 5) {
            C2316.m4361();
            return;
        }
        do {
            interfaceC5083.add(Float.valueOf(abstractC4650.mo4626()));
            if (abstractC4650.mo4612()) {
                return;
            } else {
                iMo4616 = abstractC4650.mo4616();
            }
        } while (iMo4616 == this.f16168);
        this.f16170 = iMo4616;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public void m8264(InterfaceC5083 interfaceC5083) throws C5463 {
        int iMo4616;
        int iMo4617;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        boolean z = interfaceC5083 instanceof C4416;
        int i = this.f16168;
        if (z) {
            C4416 c4416 = (C4416) interfaceC5083;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo4593 = abstractC4650.mo4593();
                m8240(iMo4593);
                int iMo4599 = abstractC4650.mo4599() + iMo4593;
                do {
                    c4416.m7714(abstractC4650.mo4604());
                } while (abstractC4650.mo4599() < iMo4599);
                return;
            }
            do {
                c4416.m7714(abstractC4650.mo4604());
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4617 = abstractC4650.mo4616();
                }
            } while (iMo4617 == this.f16168);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo4594 = abstractC4650.mo4593();
                m8240(iMo4594);
                int iMo45910 = abstractC4650.mo4599() + iMo4594;
                do {
                    interfaceC5083.add(Long.valueOf(abstractC4650.mo4604()));
                } while (abstractC4650.mo4599() < iMo45910);
                return;
            }
            do {
                interfaceC5083.add(Long.valueOf(abstractC4650.mo4604()));
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4616 = abstractC4650.mo4616();
                }
            } while (iMo4616 == this.f16168);
            iMo4617 = iMo4616;
        }
        this.f16170 = iMo4617;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public void m8265(Object obj, InterfaceC1622 interfaceC1622, C2336 c2336) throws C3406 {
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int iMo5038 = abstractC2758.mo5038();
        if (abstractC2758.f9136 >= 100) {
            throw new C3406("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iMo5059 = abstractC2758.mo5059(iMo5038);
        abstractC2758.f9136++;
        interfaceC1622.mo3392(obj, this, c2336);
        abstractC2758.mo5050(0);
        abstractC2758.f9136--;
        abstractC2758.mo5063(iMo5059);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m8266(Object obj, InterfaceC0759 interfaceC0759, C2955 c2955) throws C5463 {
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        int iMo4593 = abstractC4650.mo4593();
        if (abstractC4650.f15339 + abstractC4650.f15338 >= 100) {
            C2316.m4358("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int iMo4609 = abstractC4650.mo4609(iMo4593);
        abstractC4650.f15339++;
        interfaceC0759.mo1655(obj, this, c2955);
        abstractC4650.mo4617(0);
        abstractC4650.f15339--;
        abstractC4650.mo4607(iMo4609);
    }

    /* JADX INFO: renamed from: ۥۡ */
    public void m8267(int i) throws C5463 {
        if (((AbstractC4650) this.f16167).mo4599() == i) {
            return;
        }
        C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m8268(Object obj) {
        Object[] objArr = (Object[]) this.f16167;
        int i = this.f16166;
        objArr[i] = obj;
        int i2 = this.f16170 & (i + 1);
        this.f16166 = i2;
        int i3 = this.f16168;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            Object[] objArr2 = new Object[i5];
            AbstractC0246.m510(0, i3, length, objArr, objArr2);
            AbstractC0246.m510(i4, 0, this.f16168, (Object[]) this.f16167, objArr2);
            this.f16167 = objArr2;
            this.f16168 = 0;
            this.f16166 = length;
            this.f16170 = i5 - 1;
        }
    }

    /* JADX INFO: renamed from: ۥۤ */
    public void m8269(InterfaceC5083 interfaceC5083) throws C5463 {
        int iMo4616;
        int iMo4617;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        boolean z = interfaceC5083 instanceof C4416;
        int i = this.f16168;
        if (z) {
            C4416 c4416 = (C4416) interfaceC5083;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo4599 = abstractC4650.mo4599() + abstractC4650.mo4593();
                do {
                    c4416.m7714(abstractC4650.mo4608());
                } while (abstractC4650.mo4599() < iMo4599);
                m8267(iMo4599);
                return;
            }
            do {
                c4416.m7714(abstractC4650.mo4608());
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4617 = abstractC4650.mo4616();
                }
            } while (iMo4617 == this.f16168);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo45910 = abstractC4650.mo4599() + abstractC4650.mo4593();
                do {
                    interfaceC5083.add(Long.valueOf(abstractC4650.mo4608()));
                } while (abstractC4650.mo4599() < iMo45910);
                m8267(iMo45910);
                return;
            }
            do {
                interfaceC5083.add(Long.valueOf(abstractC4650.mo4608()));
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4616 = abstractC4650.mo4616();
                }
            } while (iMo4616 == this.f16168);
            iMo4617 = iMo4616;
        }
        this.f16170 = iMo4617;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public void m8270(InterfaceC5083 interfaceC5083, boolean z) throws C1306 {
        String strMo4606;
        int iMo4616;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        if ((this.f16168 & 7) != 2) {
            C2316.m4361();
            return;
        }
        do {
            if (z) {
                m8260(2);
                strMo4606 = abstractC4650.mo4619();
            } else {
                m8260(2);
                strMo4606 = abstractC4650.mo4606();
            }
            interfaceC5083.add(strMo4606);
            if (abstractC4650.mo4612()) {
                return;
            } else {
                iMo4616 = abstractC4650.mo4616();
            }
        } while (iMo4616 == this.f16168);
        this.f16170 = iMo4616;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public void m8271(int i) throws C1423 {
        if ((this.f16168 & 7) != i) {
            throw C3406.m6170();
        }
    }

    /* JADX INFO: renamed from: ۥۨ */
    public int m8272() {
        int iMo4616 = this.f16170;
        if (iMo4616 != 0) {
            this.f16168 = iMo4616;
            this.f16170 = 0;
        } else {
            iMo4616 = ((AbstractC4650) this.f16167).mo4616();
            this.f16168 = iMo4616;
        }
        if (iMo4616 == 0 || iMo4616 == this.f16166) {
            return Integer.MAX_VALUE;
        }
        return iMo4616 >>> 3;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public int m8273() {
        int iMo5039 = this.f16170;
        if (iMo5039 != 0) {
            this.f16168 = iMo5039;
            this.f16170 = 0;
        } else {
            iMo5039 = ((AbstractC2758) this.f16167).mo5039();
            this.f16168 = iMo5039;
        }
        if (iMo5039 == 0 || iMo5039 == this.f16166) {
            return Integer.MAX_VALUE;
        }
        return iMo5039 >>> 3;
    }

    /* JADX INFO: renamed from: ۦؒ */
    public void m8274(C3775 c3775, C5460 c5460, C2955 c2955) {
        int i;
        int i2;
        m8260(2);
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        int iMo4609 = abstractC4650.mo4609(abstractC4650.mo4593());
        Object obj = c5460.f18000;
        Object objM8246 = "";
        Object objM8247 = obj;
        while (true) {
            try {
                int iM8272 = m8272();
                if (iM8272 == Integer.MAX_VALUE || abstractC4650.mo4612()) {
                    break;
                }
                boolean zMo4624 = false;
                if (iM8272 == 1) {
                    objM8246 = m8246((EnumC4646) c5460.f18001, null, null);
                } else if (iM8272 != 2) {
                    try {
                        if (!((abstractC4650.mo4612() || (i2 = this.f16168) == this.f16166) ? false : abstractC4650.mo4624(i2))) {
                            throw new C5463("Unable to parse map entry.");
                        }
                    } catch (C1306 e) {
                        if (!abstractC4650.mo4612() && (i = this.f16168) != this.f16166) {
                            zMo4624 = abstractC4650.mo4624(i);
                        }
                        if (!zMo4624) {
                            throw new C5463("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objM8247 = m8246((EnumC4646) c5460.f17999, obj.getClass(), c2955);
                }
            } catch (Throwable th) {
                abstractC4650.mo4607(iMo4609);
                throw th;
            }
        }
        c3775.put(objM8246, objM8247);
        abstractC4650.mo4607(iMo4609);
    }

    /* JADX INFO: renamed from: ۦؔ */
    public void m8275(InterfaceC5083 interfaceC5083) throws C5463 {
        int iMo4616;
        int iMo4617;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        boolean z = interfaceC5083 instanceof C4416;
        int i = this.f16168;
        if (z) {
            C4416 c4416 = (C4416) interfaceC5083;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo4599 = abstractC4650.mo4599() + abstractC4650.mo4593();
                do {
                    c4416.m7714(abstractC4650.mo4601());
                } while (abstractC4650.mo4599() < iMo4599);
                m8267(iMo4599);
                return;
            }
            do {
                c4416.m7714(abstractC4650.mo4601());
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4617 = abstractC4650.mo4616();
                }
            } while (iMo4617 == this.f16168);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo45910 = abstractC4650.mo4599() + abstractC4650.mo4593();
                do {
                    interfaceC5083.add(Long.valueOf(abstractC4650.mo4601()));
                } while (abstractC4650.mo4599() < iMo45910);
                m8267(iMo45910);
                return;
            }
            do {
                interfaceC5083.add(Long.valueOf(abstractC4650.mo4601()));
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4616 = abstractC4650.mo4616();
                }
            } while (iMo4616 == this.f16168);
            iMo4617 = iMo4616;
        }
        this.f16170 = iMo4617;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public void m8276(InterfaceC5083 interfaceC5083) throws C5463 {
        int iMo4616;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        int i = this.f16168 & 7;
        if (i == 0) {
            do {
                interfaceC5083.add(Boolean.valueOf(abstractC4650.mo4625()));
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4616 = abstractC4650.mo4616();
                }
            } while (iMo4616 == this.f16168);
            this.f16170 = iMo4616;
            return;
        }
        if (i != 2) {
            C2316.m4361();
            return;
        }
        int iMo4599 = abstractC4650.mo4599() + abstractC4650.mo4593();
        do {
            interfaceC5083.add(Boolean.valueOf(abstractC4650.mo4625()));
        } while (abstractC4650.mo4599() < iMo4599);
        m8267(iMo4599);
    }

    /* JADX INFO: renamed from: ۦؗ */
    public void m8277(InterfaceC5083 interfaceC5083, InterfaceC0759 interfaceC0759, C2955 c2955) throws C5463 {
        int iMo4616;
        int i = this.f16168;
        if ((i & 7) != 2) {
            C2316.m4361();
            return;
        }
        do {
            AbstractC5212 abstractC5212Mo1651 = interfaceC0759.mo1651();
            m8266(abstractC5212Mo1651, interfaceC0759, c2955);
            interfaceC0759.mo1654(abstractC5212Mo1651);
            interfaceC5083.add(abstractC5212Mo1651);
            AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
            if (abstractC4650.mo4612() || this.f16170 != 0) {
                return;
            } else {
                iMo4616 = abstractC4650.mo4616();
            }
        } while (iMo4616 == i);
        this.f16170 = iMo4616;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public void m8278(InterfaceC5083 interfaceC5083) throws C5463 {
        int iMo4616;
        int iMo4617;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        boolean z = interfaceC5083 instanceof C2667;
        int i = this.f16168;
        if (z) {
            C2667 c2667 = (C2667) interfaceC5083;
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo4593 = abstractC4650.mo4593();
                m8241(iMo4593);
                int iMo4599 = abstractC4650.mo4599() + iMo4593;
                do {
                    c2667.m4969(abstractC4650.mo4621());
                } while (abstractC4650.mo4599() < iMo4599);
                return;
            }
            if (i2 != 5) {
                C2316.m4361();
                return;
            }
            do {
                c2667.m4969(abstractC4650.mo4621());
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4617 = abstractC4650.mo4616();
                }
            } while (iMo4617 == this.f16168);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iMo4594 = abstractC4650.mo4593();
                m8241(iMo4594);
                int iMo45910 = abstractC4650.mo4599() + iMo4594;
                do {
                    interfaceC5083.add(Integer.valueOf(abstractC4650.mo4621()));
                } while (abstractC4650.mo4599() < iMo45910);
                return;
            }
            if (i3 != 5) {
                C2316.m4361();
                return;
            }
            do {
                interfaceC5083.add(Integer.valueOf(abstractC4650.mo4621()));
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4616 = abstractC4650.mo4616();
                }
            } while (iMo4616 == this.f16168);
            iMo4617 = iMo4616;
        }
        this.f16170 = iMo4617;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public void m8279(InterfaceC4997 interfaceC4997) throws C3406 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int i = this.f16168 & 7;
        if (i == 1) {
            do {
                ((C2645) interfaceC4997).add(Double.valueOf(abstractC2758.mo5057()));
                if (abstractC2758.mo5040()) {
                    return;
                } else {
                    iMo5039 = abstractC2758.mo5039();
                }
            } while (iMo5039 == this.f16168);
            this.f16170 = iMo5039;
            return;
        }
        if (i != 2) {
            throw C3406.m6170();
        }
        int iMo5038 = abstractC2758.mo5038();
        if ((iMo5038 & 7) != 0) {
            throw new C3406("Failed to parse the message.");
        }
        int iMo5048 = abstractC2758.mo5048() + iMo5038;
        do {
            ((C2645) interfaceC4997).add(Double.valueOf(abstractC2758.mo5057()));
        } while (abstractC2758.mo5048() < iMo5048);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public void m8280(InterfaceC4997 interfaceC4997) throws C3406 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int i = this.f16168 & 7;
        if (i == 0) {
            do {
                ((C2645) interfaceC4997).add(Integer.valueOf(abstractC2758.mo5065()));
                if (abstractC2758.mo5040()) {
                    return;
                } else {
                    iMo5039 = abstractC2758.mo5039();
                }
            } while (iMo5039 == this.f16168);
            this.f16170 = iMo5039;
            return;
        }
        if (i != 2) {
            throw C3406.m6170();
        }
        int iMo5048 = abstractC2758.mo5048() + abstractC2758.mo5038();
        do {
            ((C2645) interfaceC4997).add(Integer.valueOf(abstractC2758.mo5065()));
        } while (abstractC2758.mo5048() < iMo5048);
        m8242(iMo5048);
    }

    /* JADX INFO: renamed from: ۦُ */
    public void m8281(InterfaceC5083 interfaceC5083, InterfaceC0759 interfaceC0759, C2955 c2955) throws C1306 {
        int iMo4616;
        int i = this.f16168;
        if ((i & 7) != 3) {
            C2316.m4361();
            return;
        }
        do {
            AbstractC5212 abstractC5212Mo1651 = interfaceC0759.mo1651();
            m8247(abstractC5212Mo1651, interfaceC0759, c2955);
            interfaceC0759.mo1654(abstractC5212Mo1651);
            interfaceC5083.add(abstractC5212Mo1651);
            AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
            if (abstractC4650.mo4612() || this.f16170 != 0) {
                return;
            } else {
                iMo4616 = abstractC4650.mo4616();
            }
        } while (iMo4616 == i);
        this.f16170 = iMo4616;
    }

    /* JADX INFO: renamed from: ۦِ */
    public C0533 m8282() throws C1423 {
        m8271(2);
        return ((AbstractC2758) this.f16167).mo5056();
    }

    /* JADX INFO: renamed from: ۦٕ */
    public void m8283(InterfaceC4997 interfaceC4997, boolean z) throws C1423 {
        String strMo5060;
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        if ((this.f16168 & 7) != 2) {
            throw C3406.m6170();
        }
        do {
            if (z) {
                m8271(2);
                strMo5060 = abstractC2758.mo5046();
            } else {
                m8271(2);
                strMo5060 = abstractC2758.mo5060();
            }
            ((C2645) interfaceC4997).add(strMo5060);
            if (abstractC2758.mo5040()) {
                return;
            } else {
                iMo5039 = abstractC2758.mo5039();
            }
        } while (iMo5039 == this.f16168);
        this.f16170 = iMo5039;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public void m8284(InterfaceC5083 interfaceC5083) throws C1306 {
        int iMo4616;
        if ((this.f16168 & 7) != 2) {
            C2316.m4361();
            return;
        }
        do {
            interfaceC5083.add(m8294());
            AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
            if (abstractC4650.mo4612()) {
                return;
            } else {
                iMo4616 = abstractC4650.mo4616();
            }
        } while (iMo4616 == this.f16168);
        this.f16170 = iMo4616;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public void m8285(InterfaceC4997 interfaceC4997) throws C3406 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int i = this.f16168 & 7;
        if (i == 1) {
            do {
                ((C2645) interfaceC4997).add(Long.valueOf(abstractC2758.mo5062()));
                if (abstractC2758.mo5040()) {
                    return;
                } else {
                    iMo5039 = abstractC2758.mo5039();
                }
            } while (iMo5039 == this.f16168);
            this.f16170 = iMo5039;
            return;
        }
        if (i != 2) {
            throw C3406.m6170();
        }
        int iMo5038 = abstractC2758.mo5038();
        if ((iMo5038 & 7) != 0) {
            throw new C3406("Failed to parse the message.");
        }
        int iMo5048 = abstractC2758.mo5048() + iMo5038;
        do {
            ((C2645) interfaceC4997).add(Long.valueOf(abstractC2758.mo5062()));
        } while (abstractC2758.mo5048() < iMo5048);
    }

    /* JADX INFO: renamed from: ۦٚ */
    public void m8286(InterfaceC5083 interfaceC5083) throws C5463 {
        int iMo4616;
        int iMo4617;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        boolean z = interfaceC5083 instanceof C4416;
        int i = this.f16168;
        if (z) {
            C4416 c4416 = (C4416) interfaceC5083;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo4599 = abstractC4650.mo4599() + abstractC4650.mo4593();
                do {
                    c4416.m7714(abstractC4650.mo4602());
                } while (abstractC4650.mo4599() < iMo4599);
                m8267(iMo4599);
                return;
            }
            do {
                c4416.m7714(abstractC4650.mo4602());
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4617 = abstractC4650.mo4616();
                }
            } while (iMo4617 == this.f16168);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo45910 = abstractC4650.mo4599() + abstractC4650.mo4593();
                do {
                    interfaceC5083.add(Long.valueOf(abstractC4650.mo4602()));
                } while (abstractC4650.mo4599() < iMo45910);
                m8267(iMo45910);
                return;
            }
            do {
                interfaceC5083.add(Long.valueOf(abstractC4650.mo4602()));
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4616 = abstractC4650.mo4616();
                }
            } while (iMo4616 == this.f16168);
            iMo4617 = iMo4616;
        }
        this.f16170 = iMo4617;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void m8287(InterfaceC4997 interfaceC4997) throws C3406 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int i = this.f16168 & 7;
        if (i == 0) {
            do {
                ((C2645) interfaceC4997).add(Boolean.valueOf(abstractC2758.mo5064()));
                if (abstractC2758.mo5040()) {
                    return;
                } else {
                    iMo5039 = abstractC2758.mo5039();
                }
            } while (iMo5039 == this.f16168);
            this.f16170 = iMo5039;
            return;
        }
        if (i != 2) {
            throw C3406.m6170();
        }
        int iMo5048 = abstractC2758.mo5048() + abstractC2758.mo5038();
        do {
            ((C2645) interfaceC4997).add(Boolean.valueOf(abstractC2758.mo5064()));
        } while (abstractC2758.mo5048() < iMo5048);
        m8242(iMo5048);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public void m8288(InterfaceC4997 interfaceC4997) throws C1423 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        if ((this.f16168 & 7) != 2) {
            throw C3406.m6170();
        }
        do {
            ((C2645) interfaceC4997).add(m8282());
            if (abstractC2758.mo5040()) {
                return;
            } else {
                iMo5039 = abstractC2758.mo5039();
            }
        } while (iMo5039 == this.f16168);
        this.f16170 = iMo5039;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public void m8289(Object obj, InterfaceC1622 interfaceC1622, C2336 c2336) {
        int i = this.f16166;
        this.f16166 = ((this.f16168 >>> 3) << 3) | 4;
        try {
            interfaceC1622.mo3392(obj, this, c2336);
            if (this.f16168 != this.f16166) {
                throw new C3406("Failed to parse the message.");
            }
            this.f16166 = i;
        } catch (Throwable th) {
            this.f16166 = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public Object m8290(EnumC1497 enumC1497, Class cls, C2336 c2336) throws C3406 {
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        switch (enumC1497.ordinal()) {
            case 0:
                m8271(1);
                return Double.valueOf(abstractC2758.mo5057());
            case 1:
                m8271(5);
                return Float.valueOf(abstractC2758.mo5043());
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                m8271(0);
                return Long.valueOf(abstractC2758.mo5042());
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                m8271(0);
                return Long.valueOf(abstractC2758.mo5052());
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                m8271(0);
                return Integer.valueOf(abstractC2758.mo5044());
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                m8271(1);
                return Long.valueOf(abstractC2758.mo5067());
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                m8271(5);
                return Integer.valueOf(abstractC2758.mo5068());
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                m8271(0);
                return Boolean.valueOf(abstractC2758.mo5064());
            case 8:
                m8271(2);
                return abstractC2758.mo5046();
            case 9:
            default:
                C1078.m2272("unsupported field type.");
                return null;
            case 10:
                m8271(2);
                InterfaceC1622 interfaceC1622M9541 = C5734.f18904.m9541(cls);
                AbstractC0318 abstractC0318Mo3393 = interfaceC1622M9541.mo3393();
                m8265(abstractC0318Mo3393, interfaceC1622M9541, c2336);
                interfaceC1622M9541.mo3387(abstractC0318Mo3393);
                return abstractC0318Mo3393;
            case 11:
                return m8282();
            case 12:
                m8271(0);
                return Integer.valueOf(abstractC2758.mo5038());
            case 13:
                m8271(0);
                return Integer.valueOf(abstractC2758.mo5065());
            case 14:
                m8271(5);
                return Integer.valueOf(abstractC2758.mo5045());
            case 15:
                m8271(1);
                return Long.valueOf(abstractC2758.mo5062());
            case 16:
                m8271(0);
                return Integer.valueOf(abstractC2758.mo5066());
            case 17:
                m8271(0);
                return Long.valueOf(abstractC2758.mo5047());
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public void m8291(InterfaceC4997 interfaceC4997) throws C3406 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int i = this.f16168 & 7;
        if (i == 0) {
            do {
                ((C2645) interfaceC4997).add(Integer.valueOf(abstractC2758.mo5066()));
                if (abstractC2758.mo5040()) {
                    return;
                } else {
                    iMo5039 = abstractC2758.mo5039();
                }
            } while (iMo5039 == this.f16168);
            this.f16170 = iMo5039;
            return;
        }
        if (i != 2) {
            throw C3406.m6170();
        }
        int iMo5048 = abstractC2758.mo5048() + abstractC2758.mo5038();
        do {
            ((C2645) interfaceC4997).add(Integer.valueOf(abstractC2758.mo5066()));
        } while (abstractC2758.mo5048() < iMo5048);
        m8242(iMo5048);
    }

    /* JADX INFO: renamed from: ۦۜ */
    public void m8292(InterfaceC5083 interfaceC5083) throws C5463 {
        int iMo4616;
        int iMo4617;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        boolean z = interfaceC5083 instanceof C2667;
        int i = this.f16168;
        if (z) {
            C2667 c2667 = (C2667) interfaceC5083;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo4599 = abstractC4650.mo4599() + abstractC4650.mo4593();
                do {
                    c2667.m4969(abstractC4650.mo4611());
                } while (abstractC4650.mo4599() < iMo4599);
                m8267(iMo4599);
                return;
            }
            do {
                c2667.m4969(abstractC4650.mo4611());
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4617 = abstractC4650.mo4616();
                }
            } while (iMo4617 == this.f16168);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    C2316.m4361();
                    return;
                }
                int iMo45910 = abstractC4650.mo4599() + abstractC4650.mo4593();
                do {
                    interfaceC5083.add(Integer.valueOf(abstractC4650.mo4611()));
                } while (abstractC4650.mo4599() < iMo45910);
                m8267(iMo45910);
                return;
            }
            do {
                interfaceC5083.add(Integer.valueOf(abstractC4650.mo4611()));
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4616 = abstractC4650.mo4616();
                }
            } while (iMo4616 == this.f16168);
            iMo4617 = iMo4616;
        }
        this.f16170 = iMo4617;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public void m8293(InterfaceC4997 interfaceC4997) throws C3406 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int i = this.f16168 & 7;
        if (i == 1) {
            do {
                ((C2645) interfaceC4997).add(Long.valueOf(abstractC2758.mo5067()));
                if (abstractC2758.mo5040()) {
                    return;
                } else {
                    iMo5039 = abstractC2758.mo5039();
                }
            } while (iMo5039 == this.f16168);
            this.f16170 = iMo5039;
            return;
        }
        if (i != 2) {
            throw C3406.m6170();
        }
        int iMo5038 = abstractC2758.mo5038();
        if ((iMo5038 & 7) != 0) {
            throw new C3406("Failed to parse the message.");
        }
        int iMo5048 = abstractC2758.mo5048() + iMo5038;
        do {
            ((C2645) interfaceC4997).add(Long.valueOf(abstractC2758.mo5067()));
        } while (abstractC2758.mo5048() < iMo5048);
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public AbstractC4314 m8294() {
        m8260(2);
        return ((AbstractC4650) this.f16167).mo4605();
    }

    /* JADX INFO: renamed from: ۦۣ */
    public void m8295(InterfaceC5083 interfaceC5083) throws C5463 {
        int iMo4616;
        int iMo4617;
        AbstractC4650 abstractC4650 = (AbstractC4650) this.f16167;
        boolean z = interfaceC5083 instanceof C2667;
        int i = this.f16168;
        if (z) {
            C2667 c2667 = (C2667) interfaceC5083;
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo4593 = abstractC4650.mo4593();
                m8241(iMo4593);
                int iMo4599 = abstractC4650.mo4599() + iMo4593;
                do {
                    c2667.m4969(abstractC4650.mo4597());
                } while (abstractC4650.mo4599() < iMo4599);
                return;
            }
            if (i2 != 5) {
                C2316.m4361();
                return;
            }
            do {
                c2667.m4969(abstractC4650.mo4597());
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4617 = abstractC4650.mo4616();
                }
            } while (iMo4617 == this.f16168);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iMo4594 = abstractC4650.mo4593();
                m8241(iMo4594);
                int iMo45910 = abstractC4650.mo4599() + iMo4594;
                do {
                    interfaceC5083.add(Integer.valueOf(abstractC4650.mo4597()));
                } while (abstractC4650.mo4599() < iMo45910);
                return;
            }
            if (i3 != 5) {
                C2316.m4361();
                return;
            }
            do {
                interfaceC5083.add(Integer.valueOf(abstractC4650.mo4597()));
                if (abstractC4650.mo4612()) {
                    return;
                } else {
                    iMo4616 = abstractC4650.mo4616();
                }
            } while (iMo4616 == this.f16168);
            iMo4617 = iMo4616;
        }
        this.f16170 = iMo4617;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public void m8296(InterfaceC4997 interfaceC4997) throws C3406 {
        int iMo5039;
        AbstractC2758 abstractC2758 = (AbstractC2758) this.f16167;
        int i = this.f16168 & 7;
        if (i == 2) {
            int iMo5038 = abstractC2758.mo5038();
            if ((iMo5038 & 3) != 0) {
                throw new C3406("Failed to parse the message.");
            }
            int iMo5048 = abstractC2758.mo5048() + iMo5038;
            do {
                ((C2645) interfaceC4997).add(Integer.valueOf(abstractC2758.mo5068()));
            } while (abstractC2758.mo5048() < iMo5048);
            return;
        }
        if (i != 5) {
            throw C3406.m6170();
        }
        do {
            ((C2645) interfaceC4997).add(Integer.valueOf(abstractC2758.mo5068()));
            if (abstractC2758.mo5040()) {
                return;
            } else {
                iMo5039 = abstractC2758.mo5039();
            }
        } while (iMo5039 == this.f16168);
        this.f16170 = iMo5039;
    }

    public C4902(AbstractC4650 abstractC4650) {
        this.f16169 = 5;
        this.f16170 = 0;
        this.f16167 = abstractC4650;
        abstractC4650.f15337 = this;
    }

    public /* synthetic */ C4902(int i) {
        this.f16169 = i;
    }

    public C4902(C0188 c0188) {
        this.f16169 = 3;
        this.f16167 = c0188;
    }

    public C4902(int i, int i2, int i3, C3828 c3828) {
        this.f16169 = 4;
        this.f16168 = i;
        this.f16166 = i2;
        this.f16170 = i3;
        this.f16167 = c3828;
    }
}
