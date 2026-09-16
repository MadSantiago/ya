package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: ۥؚؐؔۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0126 {

    /* JADX INFO: renamed from: ۥؗ */
    public Object[] f482;

    /* JADX INFO: renamed from: ۥَ */
    public C4912 f483;

    /* JADX INFO: renamed from: ۥُ */
    public HashMap f484;

    /* JADX INFO: renamed from: ۥّ */
    public C4912 f485;

    /* JADX INFO: renamed from: ۥْ */
    public final C1624 f486;

    /* JADX INFO: renamed from: ۥٓ */
    public final C1624 f487;

    /* JADX INFO: renamed from: ۥٖ */
    public int f488;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f489;

    /* JADX INFO: renamed from: ۥۗ */
    public int[] f490;

    /* JADX INFO: renamed from: ۥۜ */
    public int f491;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2575 f492;

    /* JADX INFO: renamed from: ۦؑ */
    public ArrayList f493;

    /* JADX INFO: renamed from: ۦؚ */
    public int f494;

    /* JADX INFO: renamed from: ۦٌ */
    public int f495;

    /* JADX INFO: renamed from: ۦِ */
    public int f496;

    /* JADX INFO: renamed from: ۦٕ */
    public C4523 f497;

    /* JADX INFO: renamed from: ۦٗ */
    public int f498;

    /* JADX INFO: renamed from: ۦٛ */
    public int f499;

    /* JADX INFO: renamed from: ۦۗ */
    public int f500;

    /* JADX INFO: renamed from: ۦۙ */
    public int f501;

    /* JADX INFO: renamed from: ۦۚ */
    public int f502;

    /* JADX INFO: renamed from: ۦۛ */
    public int f503;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1624 f504;

    /* JADX INFO: renamed from: ۦۨ */
    public int f505;

    public C0126(C2575 c2575) {
        this.f492 = c2575;
        int[] iArr = c2575.f8603;
        this.f490 = iArr;
        Object[] objArr = c2575.f8594;
        this.f482 = objArr;
        this.f493 = c2575.f8598;
        this.f484 = c2575.f8599;
        this.f485 = c2575.f8597;
        int i = c2575.f8602;
        this.f501 = i;
        this.f491 = (iArr.length / 5) - i;
        int i2 = c2575.f8595;
        this.f500 = i2;
        this.f494 = objArr.length - i2;
        this.f495 = i;
        this.f504 = new C1624();
        this.f486 = new C1624();
        this.f487 = new C1624();
        this.f498 = i;
        this.f503 = -1;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static void m226(C0126 c0126) {
        int i = c0126.f503;
        int iM236 = c0126.m236(i);
        int[] iArr = c0126.f490;
        int i2 = (iM236 * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        c0126.m251(c0126.m262(iArr, i));
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static int m227(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f488 + " end=" + this.f498 + " size = " + m271() + " gap=" + this.f501 + '-' + (this.f501 + this.f491) + ')';
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final void m228(int i) {
        C4356 c4356;
        int i2;
        C4356 c4357;
        int i3;
        int i4;
        int i5 = this.f491;
        int i6 = this.f501;
        if (i6 != i) {
            if (!this.f493.isEmpty()) {
                int iM266 = m266() - this.f491;
                ArrayList arrayList = this.f493;
                if (i6 < i) {
                    for (int iM6811 = AbstractC3809.m6811(arrayList, i6, iM266); iM6811 < this.f493.size() && (i3 = (c4357 = (C4356) this.f493.get(iM6811)).f14359) < 0 && (i4 = i3 + iM266) < i; iM6811++) {
                        c4357.f14359 = i4;
                    }
                } else {
                    for (int iM6812 = AbstractC3809.m6811(arrayList, i, iM266); iM6812 < this.f493.size() && (i2 = (c4356 = (C4356) this.f493.get(iM6812)).f14359) >= 0; iM6812++) {
                        c4356.f14359 = -(iM266 - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.f490;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    AbstractC0246.m523(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    AbstractC0246.m523(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iM267 = m266();
            if (i6 >= iM267) {
                AbstractC5508.m9201("Check failed");
            }
            while (i6 < iM267) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.f490[i10];
                int iM271 = i11 > -2 ? i11 : (m271() + i11) - (-2);
                if (iM271 >= i) {
                    iM271 = -((m271() - iM271) - (-2));
                }
                if (iM271 != i11) {
                    this.f490[i10] = iM271;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.f501 = i;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final int m229(int[] iArr, int i) {
        if (i >= m266()) {
            return this.f482.length - this.f494;
        }
        int iM6813 = AbstractC3809.m6813(iArr, i);
        return iM6813 < 0 ? (this.f482.length - this.f494) + iM6813 + 1 : iM6813;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final void m230(C2575 c2575, int i) {
        if (this.f502 <= 0) {
            AbstractC5508.m9201("Check failed");
        }
        boolean z = false;
        byte b = 0;
        byte b2 = 0;
        if (i == 0 && this.f488 == 0 && this.f492.f8602 == 0) {
            int[] iArr = c2575.f8603;
            int i2 = iArr[(i * 5) + 3];
            int i3 = c2575.f8602;
            if (i2 == i3) {
                int[] iArr2 = this.f490;
                Object[] objArr = this.f482;
                ArrayList arrayList = this.f493;
                HashMap map = this.f484;
                C4912 c4912 = this.f485;
                Object[] objArr2 = c2575.f8594;
                int i4 = c2575.f8595;
                HashMap map2 = c2575.f8599;
                C4912 c4913 = c2575.f8597;
                this.f490 = iArr;
                this.f482 = objArr2;
                this.f493 = c2575.f8598;
                this.f501 = i3;
                this.f491 = (iArr.length / 5) - i3;
                this.f500 = i4;
                this.f494 = objArr2.length - i4;
                this.f495 = i3;
                this.f484 = map2;
                this.f485 = c4913;
                c2575.f8603 = iArr2;
                c2575.f8602 = b2 == true ? 1 : 0;
                c2575.f8594 = objArr;
                c2575.f8595 = b == true ? 1 : 0;
                c2575.f8598 = arrayList;
                c2575.f8599 = map;
                c2575.f8597 = c4912;
                return;
            }
        }
        C0126 c0126M4872 = c2575.m4872();
        try {
            AbstractC2776.m5237(c0126M4872, i, this, true, true, false);
            boolean z2 = true;
        } finally {
            c0126M4872.m234(z);
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final int m231(C4356 c4356) {
        int i = c4356.f14359;
        return i < 0 ? m271() + i : i;
    }

    /* JADX INFO: renamed from: ۥً */
    public final Object m232(int i) {
        int iM236 = m236(i);
        int[] iArr = this.f490;
        if ((iArr[(iM236 * 5) + 1] & 1073741824) != 0) {
            return this.f482[m265(m235(iArr, iM236))];
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final Object m233(int i) {
        int iM236 = m236(i);
        int[] iArr = this.f490;
        int i2 = iM236 * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f482[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m234(boolean z) {
        this.f489 = true;
        if (z && this.f504.f5436 == 0) {
            m228(m271());
            m249(this.f482.length - this.f494, this.f501);
            int i = this.f500;
            Arrays.fill(this.f482, i, this.f494 + i, (Object) null);
            m245();
        }
        int[] iArr = this.f490;
        int i2 = this.f501;
        Object[] objArr = this.f482;
        int i3 = this.f500;
        ArrayList arrayList = this.f493;
        HashMap map = this.f484;
        C4912 c4912 = this.f485;
        C2575 c2575 = this.f492;
        if (!c2575.f8600) {
            AbstractC0371.m795("Unexpected writer close()");
        }
        c2575.f8600 = false;
        c2575.f8603 = iArr;
        c2575.f8602 = i2;
        c2575.f8594 = objArr;
        c2575.f8595 = i3;
        c2575.f8598 = arrayList;
        c2575.f8599 = map;
        c2575.f8597 = c4912;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final int m235(int[] iArr, int i) {
        if (i >= m266()) {
            return this.f482.length - this.f494;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.f482.length - this.f494) + i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final int m236(int i) {
        return (this.f491 * (i < this.f501 ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final int m237(int i) {
        return this.f490[m236(i) * 5];
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final Object m238(Object obj) {
        if (this.f502 > 0) {
            m243(1, this.f503);
        }
        Object[] objArr = this.f482;
        int i = this.f499;
        this.f499 = i + 1;
        Object obj2 = objArr[m265(i)];
        if (this.f499 > this.f496) {
            AbstractC5508.m9201("Writing to an invalid slot");
        }
        this.f482[m265(this.f499 - 1)] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final int m239(int i) {
        return this.f490[(m236(i) * 5) + 3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ٘ */
    public final void m240(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.f503;
        byte b = this.f502 > 0;
        this.f487.m3395(this.f505);
        C4036 c4036 = C2850.f9517;
        if (b == true) {
            int i4 = this.f488;
            int iM235 = m235(this.f490, m236(i4));
            m267(1);
            this.f499 = iM235;
            this.f496 = iM235;
            int iM236 = m236(i4);
            int i5 = obj != c4036 ? 1 : 0;
            int i6 = (z || obj2 == c4036) ? 0 : 1;
            int iM227 = m227(iM235, this.f500, this.f494, this.f482.length);
            if (iM227 >= 0 && this.f495 < i4) {
                iM227 = -(((this.f482.length - this.f494) - iM227) + 1);
            }
            int[] iArr = this.f490;
            int i7 = this.f503;
            int i8 = iM236 * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iM227;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                m243(i9, i4);
                Object[] objArr = this.f482;
                int i10 = this.f499;
                if (z) {
                    objArr[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr[i10] = obj2;
                    i10++;
                }
                this.f499 = i10;
            }
            this.f505 = 0;
            i2 = i4 + 1;
            this.f503 = i4;
            this.f488 = i2;
            if (i3 >= 0) {
                m268(i3);
            }
        } else {
            this.f504.m3395(i3);
            this.f486.m3395((m266() - this.f491) - this.f498);
            int i11 = this.f488;
            int iM237 = m236(i11);
            if (!AbstractC3831.m6874(obj2, c4036)) {
                if (z) {
                    m242(this.f488, obj2);
                } else {
                    m247(obj2);
                }
            }
            this.f499 = m229(this.f490, iM237);
            this.f496 = m235(this.f490, m236(this.f488 + 1));
            int[] iArr2 = this.f490;
            int i12 = iM237 * 5;
            this.f505 = iArr2[i12 + 1] & 67108863;
            this.f503 = i11;
            this.f488 = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.f498 = i2;
    }

    /* JADX INFO: renamed from: ۥٛ */
    public final C4356 m241(int i) {
        ArrayList arrayList;
        int iM6808;
        if (i < 0 || i >= m271() || (iM6808 = AbstractC3809.m6808((arrayList = this.f493), i, m271())) < 0) {
            return null;
        }
        return (C4356) arrayList.get(iM6808);
    }

    /* JADX INFO: renamed from: ۥٝ */
    public final void m242(int i, Object obj) {
        int iM236 = m236(i);
        int[] iArr = this.f490;
        if (iM236 >= iArr.length || (iArr[(iM236 * 5) + 1] & 1073741824) == 0) {
            AbstractC5508.m9201("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.f482[m265(m235(this.f490, iM236))] = obj;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m243(int i, int i2) {
        if (i > 0) {
            m249(this.f499, i2);
            int i3 = this.f500;
            int i4 = this.f494;
            if (i4 < i) {
                Object[] objArr = this.f482;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.f482 = objArr2;
                i4 = i7;
            }
            int i9 = this.f496;
            if (i9 >= i3) {
                this.f496 = i9 + i;
            }
            this.f500 = i3 + i;
            this.f494 = i4 - i;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C4356 m244(int i) {
        ArrayList arrayList = this.f493;
        int iM6808 = AbstractC3809.m6808(arrayList, i, m271());
        if (iM6808 >= 0) {
            return (C4356) arrayList.get(iM6808);
        }
        if (i > this.f501) {
            i = -(m271() - i);
        }
        C4356 c4356 = new C4356(i);
        arrayList.add(-(iM6808 + 1), c4356);
        return c4356;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final void m245() {
        int i;
        C4523 c4523 = this.f497;
        if (c4523 != null) {
            while (c4523.f14948 != 0) {
                int iM4121 = AbstractC2133.m4121(c4523);
                int iM236 = m236(iM4121);
                int iM239 = iM4121 + 1;
                int iM2310 = m239(iM4121) + iM4121;
                while (true) {
                    if (iM239 >= iM2310) {
                        i = 0;
                        break;
                    } else {
                        if ((this.f490[(m236(iM239) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iM239 += m239(iM239);
                    }
                }
                int[] iArr = this.f490;
                int i2 = (iM236 * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iM262 = m262(iArr, iM4121);
                    if (iM262 >= 0) {
                        AbstractC2133.m4123(c4523, iM262);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m246(int i) {
        if (i < 0) {
            AbstractC5508.m9201("Cannot seek backwards");
        }
        if (this.f502 > 0) {
            AbstractC0371.m794("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f488 + i;
        if (i2 < this.f503 || i2 > this.f498) {
            AbstractC5508.m9201("Cannot seek outside the current group (" + this.f503 + '-' + this.f498 + ')');
        }
        this.f488 = i2;
        int iM235 = m235(this.f490, m236(i2));
        this.f499 = iM235;
        this.f496 = iM235;
    }

    /* JADX INFO: renamed from: ۥۤ */
    public final void m247(Object obj) {
        int iM236 = m236(this.f488);
        int i = (iM236 * 5) + 1;
        if ((this.f490[i] & 268435456) == 0) {
            AbstractC5508.m9201("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f482;
        int[] iArr = this.f490;
        objArr[m265(Integer.bitCount(iArr[i] >> 29) + m235(iArr, iM236))] = obj;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final void m248(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f494;
            int i5 = i + i2;
            m249(i5, i3);
            this.f500 = i;
            this.f494 = i4 + i2;
            Arrays.fill(this.f482, i, i5, (Object) null);
            int i6 = this.f496;
            if (i6 >= i) {
                this.f496 = i6 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m249(int i, int i2) {
        int i3 = this.f494;
        int i4 = this.f500;
        int i5 = this.f495;
        if (i4 != i) {
            Object[] objArr = this.f482;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, m271());
        if (i5 != iMin) {
            int length = this.f482.length - i3;
            if (iMin < i5) {
                int iM236 = m236(iMin);
                int iM237 = m236(i5);
                int i7 = this.f501;
                while (iM236 < iM237) {
                    int i8 = (iM236 * 5) + 4;
                    int i9 = this.f490[i8];
                    if (i9 < 0) {
                        AbstractC5508.m9201("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f490[i8] = -((length - i9) + 1);
                    iM236++;
                    if (iM236 == i7) {
                        iM236 += this.f491;
                    }
                }
            } else {
                int iM238 = m236(i5);
                int iM239 = m236(iMin);
                while (iM238 < iM239) {
                    int i10 = (iM238 * 5) + 4;
                    int i11 = this.f490[i10];
                    if (i11 >= 0) {
                        AbstractC5508.m9201("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f490[i10] = i11 + length + 1;
                    iM238++;
                    if (iM238 == this.f501) {
                        iM238 += this.f491;
                    }
                }
            }
            this.f495 = iMin;
        }
        this.f500 = i;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m250() {
        int i = this.f502;
        this.f502 = i + 1;
        if (i == 0) {
            this.f486.m3395((m266() - this.f491) - this.f498);
        }
    }

    /* JADX INFO: renamed from: ۦؒ */
    public final void m251(int i) {
        if (i >= 0) {
            C4523 c4523 = this.f497;
            if (c4523 == null) {
                c4523 = new C4523();
                this.f497 = c4523;
            }
            AbstractC2133.m4123(c4523, i);
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final boolean m252(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.f493;
            m228(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f484;
                int i3 = i + i2;
                int iM6811 = AbstractC3809.m6811(this.f493, i3, m266() - this.f491);
                if (iM6811 >= this.f493.size()) {
                    iM6811--;
                }
                int i4 = iM6811 + 1;
                int i5 = 0;
                while (iM6811 >= 0) {
                    C4356 c4356 = (C4356) this.f493.get(iM6811);
                    int iM231 = m231(c4356);
                    if (iM231 < i) {
                        break;
                    }
                    if (iM231 < i3) {
                        c4356.f14359 = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iM6811 + 1;
                        }
                        i4 = iM6811;
                    }
                    iM6811--;
                }
                z = i4 < i5;
                if (z) {
                    this.f493.subList(i4, i5).clear();
                }
            }
            this.f501 = i;
            this.f491 += i2;
            int i6 = this.f495;
            if (i6 > i) {
                this.f495 = Math.max(i, i6 - i2);
            }
            int i7 = this.f498;
            if (i7 >= this.f501) {
                this.f498 = i7 - i2;
            }
            int i8 = this.f503;
            if (i8 >= 0 && (this.f490[(m236(i8) * 5) + 1] & 67108864) != 0) {
                m251(i8);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final Object m253(int i, int i2, Object obj) {
        int iM229 = m229(this.f490, m236(i));
        int iM235 = m235(this.f490, m236(i + 1));
        int i3 = iM229 + i2;
        if (i3 < iM229 || i3 >= iM235) {
            AbstractC5508.m9201("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iM265 = m265(i3);
        Object[] objArr = this.f482;
        Object obj2 = objArr[iM265];
        objArr[iM265] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final boolean m254() {
        if (this.f502 != 0) {
            AbstractC5508.m9201("Cannot remove group while inserting");
        }
        int i = this.f488;
        int i2 = this.f499;
        int iM235 = m235(this.f490, m236(i));
        int iM257 = m257();
        m268(this.f503);
        C4523 c4523 = this.f497;
        if (c4523 != null) {
            while (true) {
                int i3 = c4523.f14948;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    C0178.m384("IntList is empty.");
                    return false;
                }
                if (c4523.f14949[0] < i) {
                    break;
                }
                AbstractC2133.m4121(c4523);
            }
        }
        boolean zM252 = m252(i, this.f488 - i);
        m248(iM235, this.f499 - iM235, i - 1);
        this.f488 = i;
        this.f499 = i2;
        this.f505 -= iM257;
        return zM252;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m255(int i, int i2, int i3) {
        if (i >= this.f501) {
            i = -((m271() - i) + 2);
        }
        while (i3 < i2) {
            this.f490[(m236(i3) * 5) + 2] = i;
            int i4 = this.f490[(m236(i3) * 5) + 3] + i3;
            m255(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m256(int i, InterfaceC5731 interfaceC5731) {
        int i2;
        int i3;
        int i4;
        int iM262 = m262(this.f490, i);
        int iM271 = m271();
        int iM239 = m239(i) + i;
        int i5 = i;
        C0482 c0482 = null;
        C4523 c4523 = null;
        while (i5 < iM239) {
            int iM235 = m235(this.f490, m236(i5));
            int i6 = i5 + 1;
            int iM236 = m235(this.f490, m236(i6));
            while (iM235 < iM236) {
                Object obj = this.f482[m265(iM235)];
                if (obj instanceof C1670) {
                    C1670 c1670 = (C1670) obj;
                    if (!(c1670 instanceof C1670)) {
                        c1670 = null;
                    }
                    if (c1670 == null) {
                        AbstractC5508.m9200("Inconsistent composition");
                        C1078.m2274();
                        return;
                    }
                    int i7 = c1670.f5566;
                    if (i7 >= 0) {
                        int iM2310 = m239(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < iM2310 && i9 < i7) {
                            int iM237 = m236(i8);
                            int i10 = iM262;
                            int[] iArr = this.f490;
                            int i11 = iM237 * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < iM2310 && (iArr[i11 + 1] & 536870912) == 0) {
                                i9++;
                            }
                            iM262 = i10;
                        }
                        i4 = iM262;
                        if (c0482 == null) {
                            int[] iArr2 = AbstractC5291.f17428;
                            c0482 = new C0482();
                        }
                        if (c4523 == null) {
                            c4523 = new C4523();
                        }
                        c0482.m1032(i8);
                        c4523.m7843(i8);
                        c4523.m7843(iM235);
                    }
                    iM235++;
                    iM262 = i4;
                }
                i4 = iM262;
                interfaceC5731.mo219(Integer.valueOf(iM235), obj);
                iM235++;
                iM262 = i4;
            }
            int i12 = iM262;
            iM262 = i6 < iM271 ? m262(this.f490, i6) : -1;
            if (iM262 != i5) {
                int iM263 = i12;
                while (true) {
                    if (c4523 == null || c0482 == null || !c0482.m1030(i5)) {
                        i2 = iM271;
                    } else {
                        int i13 = c4523.f14948;
                        int i14 = i13 / 2;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i14) {
                            int i17 = i15 * 2;
                            int i18 = iM271;
                            int iM7840 = c4523.m7840(i17);
                            if (iM7840 == i5) {
                                int iM7841 = c4523.m7840(i17 + 1);
                                interfaceC5731.mo219(Integer.valueOf(iM7841), this.f482[m265(iM7841)]);
                            } else if (i17 != i16) {
                                int i19 = i16 + 1;
                                c4523.m7841(i16, iM7840);
                                i16 += 2;
                                c4523.m7841(i19, c4523.m7840(i17 + 1));
                            } else {
                                i16 += 2;
                            }
                            i15++;
                            interfaceC5731 = interfaceC5731;
                            iM271 = i18;
                        }
                        i2 = iM271;
                        if (i16 != i13) {
                            if (i16 < 0 || i16 > (i3 = c4523.f14948) || i13 < 0 || i13 > i3) {
                                AbstractC2552.m4812("Index must be between 0 and size");
                                throw null;
                            }
                            if (i13 < i16) {
                                AbstractC2552.m4814("The end index must be < start index");
                                throw null;
                            }
                            if (i13 != i16) {
                                if (i13 < i3) {
                                    int[] iArr3 = c4523.f14949;
                                    AbstractC0246.m523(i16, i13, i3, iArr3, iArr3);
                                }
                                c4523.f14948 -= i13 - i16;
                            }
                        }
                    }
                    if (i5 == i || iM263 == iM262) {
                        break;
                    }
                    i5 = iM263;
                    iM271 = i2;
                    iM263 = m262(this.f490, iM263);
                    interfaceC5731 = interfaceC5731;
                }
            } else {
                i2 = iM271;
            }
            i5 = i6;
            iM271 = i2;
        }
    }

    /* JADX INFO: renamed from: ۦُ */
    public final int m257() {
        int iM236 = m236(this.f488);
        int i = this.f488;
        int[] iArr = this.f490;
        int i2 = iM236 * 5;
        int i3 = iArr[i2 + 3] + i;
        this.f488 = i3;
        this.f499 = m235(iArr, m236(i3));
        int i4 = this.f490[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m258() {
        if (this.f502 <= 0) {
            AbstractC0371.m794("Unbalanced begin/end insert");
        }
        int i = this.f502 - 1;
        this.f502 = i;
        if (i == 0) {
            if (this.f487.f5436 != this.f504.f5436) {
                AbstractC5508.m9201("startGroup/endGroup mismatch while inserting");
            }
            this.f498 = (m266() - this.f491) - this.f486.m3398();
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m259(int i) {
        return (this.f490[(m236(i) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final void m260() {
        int i = this.f498;
        this.f488 = i;
        this.f499 = m235(this.f490, m236(i));
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final boolean m261(int i, int i2) {
        int iM266;
        int iM239;
        if (i2 == this.f503) {
            iM266 = this.f498;
        } else {
            C1624 c1624 = this.f504;
            if (i2 > c1624.m3399(0)) {
                iM239 = m239(i2);
            } else {
                int[] iArr = c1624.f5437;
                int iMin = Math.min(iArr.length, c1624.f5436);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iM239 = m239(i2);
                } else {
                    iM266 = (m266() - this.f491) - this.f486.f5437[i3];
                }
            }
            iM266 = iM239 + i2;
        }
        return i > i2 && i < iM266;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final int m262(int[] iArr, int i) {
        int i2 = iArr[(m236(i) * 5) + 2];
        return i2 > -2 ? i2 : (m271() + i2) - (-2);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m263() {
        C2730 c2730;
        boolean z = this.f502 > 0;
        int i = this.f488;
        int i2 = this.f498;
        int i3 = this.f503;
        int iM236 = m236(i3);
        int i4 = this.f505;
        int i5 = i - i3;
        int i6 = iM236 * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.f490[i7] & 1073741824) != 0;
        C1624 c1624 = this.f487;
        if (z) {
            C4912 c4912 = this.f483;
            if (c4912 != null && (c2730 = (C2730) c4912.m9571(i3)) != null) {
                Object[] objArr = c2730.f9041;
                int i8 = c2730.f9040;
                for (int i9 = 0; i9 < i8; i9++) {
                    m238(objArr[i9]);
                }
            }
            int[] iArr = this.f490;
            iArr[i6 + 3] = i5;
            AbstractC3809.m6810(iM236, i4, iArr);
            int iM3398 = c1624.m3398();
            if (z2) {
                i4 = 1;
            }
            this.f505 = iM3398 + i4;
            int iM262 = m262(this.f490, i3);
            this.f503 = iM262;
            int iM271 = iM262 < 0 ? m271() : m236(iM262 + 1);
            int iM235 = iM271 >= 0 ? m235(this.f490, iM271) : 0;
            this.f499 = iM235;
            this.f496 = iM235;
            return;
        }
        if (i != i2) {
            AbstractC5508.m9201("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f490;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        AbstractC3809.m6810(iM236, i4, iArr2);
        int iM3399 = this.f504.m3398();
        this.f498 = (m266() - this.f491) - this.f486.m3398();
        this.f503 = iM3399;
        int iM263 = m262(this.f490, i3);
        int iM33910 = c1624.m3398();
        this.f505 = iM33910;
        if (iM263 == iM3399) {
            this.f505 = iM33910 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iM263 != 0 && iM263 != iM3399 && (i14 != 0 || i13 != 0)) {
                int iM237 = m236(iM263);
                if (i13 != 0) {
                    int[] iArr3 = this.f490;
                    int i15 = (iM237 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.f490;
                    AbstractC3809.m6810(iM237, (iArr4[(iM237 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.f490;
                if ((iArr5[(iM237 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iM263 = m262(iArr5, iM263);
            }
        }
        this.f505 += i14;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m264(int i) {
        boolean z = false;
        if (!(this.f502 <= 0)) {
            AbstractC5508.m9201("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.f503;
        if (i2 != i) {
            if (i >= i2 && i < this.f498) {
                z = true;
            }
            if (!z) {
                AbstractC5508.m9201("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.f488;
            int i4 = this.f499;
            int i5 = this.f496;
            this.f488 = i;
            m270();
            this.f488 = i3;
            this.f499 = i4;
            this.f496 = i5;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final int m265(int i) {
        return (this.f494 * (i < this.f500 ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final int m266() {
        return this.f490.length / 5;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m267(int i) {
        if (i > 0) {
            int i2 = this.f488;
            m228(i2);
            int i3 = this.f501;
            int i4 = this.f491;
            int[] iArr = this.f490;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                AbstractC0246.m523(0, 0, i3 * 5, iArr, iArr2);
                AbstractC0246.m523((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.f490 = iArr2;
                i4 = i6;
                iArr = iArr2;
            }
            int i7 = this.f498;
            if (i7 >= i3) {
                this.f498 = i7 + i;
            }
            int i8 = i3 + i;
            this.f501 = i8;
            this.f491 = i4 - i;
            int iM227 = m227(i5 > 0 ? m235(iArr, m236(i2 + i)) : 0, this.f495 >= i3 ? this.f500 : 0, this.f494, this.f482.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.f490[(i9 * 5) + 4] = iM227;
            }
            int i10 = this.f495;
            if (i10 >= i3) {
                this.f495 = i10 + i;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final AbstractC5020 m268(int i) {
        C4356 c4356M241;
        HashMap map = this.f484;
        if (map == null || (c4356M241 = m241(i)) == null) {
            return null;
        }
        return (AbstractC5020) map.get(c4356M241);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object m269(int i) {
        int iM236 = m236(i);
        int[] iArr = this.f490;
        int i2 = (iM236 * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return C2850.f9517;
        }
        return this.f482[Integer.bitCount(iArr[i2] >> 29) + m235(iArr, iM236)];
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final void m270() {
        if (this.f502 != 0) {
            AbstractC5508.m9201("Key must be supplied when inserting");
        }
        C4036 c4036 = C2850.f9517;
        m240(0, c4036, c4036, false);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final int m271() {
        return m266() - this.f491;
    }
}
