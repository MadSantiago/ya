package p000;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦؚؔٔؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3592 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f11948;

    /* JADX INFO: renamed from: ۥٖ */
    public int f11949;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C3635 f11950;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3592(C3635 c3635, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f11948 = i;
        this.f11950 = c3635;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f11948;
        C3635 c3635 = this.f11950;
        switch (i) {
            case 0:
                return new C3592(c3635, interfaceC0443, 0);
            case 1:
                return new C3592(c3635, interfaceC0443, 1);
            default:
                return new C3592(c3635, interfaceC0443, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0149  */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i;
        C1249 c1249M8119;
        InterfaceC1625 interfaceC1625;
        Object c4235;
        Object c1249;
        CharSequence text;
        int i2;
        C5086 c5086;
        C1249 c12410;
        int i3 = this.f11948;
        EnumC1546 enumC1546 = EnumC1546.f5232;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        byte b = 1;
        C3635 c3635 = this.f11950;
        C2358 c2358 = C2358.f7817;
        switch (i3) {
            case 0:
                int i4 = this.f11949;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC0186.m409(obj);
                    } else {
                        if (i4 != 2) {
                            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC0186.m409(obj);
                    }
                    return c2358;
                }
                AbstractC0186.m409(obj);
                this.f11949 = 1;
                if (c3635.m6475(this) == enumC2282) {
                    return enumC2282;
                }
                C3869 c3869M6472 = c3635.m6472();
                if (c3869M6472 != null) {
                    String str = (String) c3869M6472.f12915;
                    long j = ((C3346) c3869M6472.f12914).f11197;
                    InterfaceC2007 interfaceC2007 = c3635.f12156;
                    if (interfaceC2007 != null) {
                        this.f11949 = 2;
                        C0385 c0385 = (C0385) interfaceC2007;
                        Object objM5144 = (str.length() == 0 || C3346.m6107(j)) ? c2358 : AbstractC2765.m5144(c0385.f1439, new C1734(c0385, new C0058(j, null, c0385, str), null, 6), this);
                        if (objM5144 != enumC2282) {
                            objM5144 = c2358;
                        }
                        if (objM5144 == enumC2282) {
                            return enumC2282;
                        }
                    }
                }
                return c2358;
            case 1:
                int i5 = this.f11949;
                if (i5 == 0) {
                    AbstractC0186.m409(obj);
                    if (C3346.m6107(c3635.m6479().f18943) || !c3635.m6476()) {
                        i = 1;
                        c1249M8119 = null;
                    } else {
                        c1249M8119 = C4773.m8119(c3635.m6479());
                        C1249 c1249M8136 = C4773.m8136(c3635.m6479(), c3635.m6479().f18944.f4307.length());
                        C1249 c1249M8117 = C4773.m8117(c3635.m6479(), c3635.m6479().f18944.f4307.length());
                        C4042 c4042 = new C4042(c1249M8136);
                        c4042.m7243(c1249M8117);
                        C1249 c1249M7241 = c4042.m7241();
                        int iM6109 = C3346.m6109(c3635.m6479().f18943);
                        c3635.f12138.mo211(C3635.m6468(c1249M7241, AbstractC2765.m5145(iM6109, iM6109)));
                        c3635.m6474(enumC1546);
                        i = 1;
                        c3635.f12149.f10938 = true;
                    }
                    if (c1249M8119 != null && (interfaceC1625 = c3635.f12158) != null) {
                        C4235 c4235M7771 = AbstractC4489.m7771(c1249M8119);
                        this.f11949 = i;
                        ((C2471) interfaceC1625).m4634(c4235M7771);
                        if (c2358 == enumC2282) {
                            return enumC2282;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                return c2358;
            default:
                int i6 = this.f11949;
                if (i6 == 0) {
                    AbstractC0186.m409(obj);
                    InterfaceC1625 interfaceC1626 = c3635.f12158;
                    if (interfaceC1626 != null) {
                        this.f11949 = 1;
                        ClipData primaryClip = ((C2471) interfaceC1626).f8246.m1656().getPrimaryClip();
                        c4235 = primaryClip != null ? new C4235(primaryClip) : null;
                        if (c4235 == enumC2282) {
                            return enumC2282;
                        }
                    }
                    return c2358;
                }
                if (i6 == 1) {
                    AbstractC0186.m409(obj);
                    c4235 = obj;
                } else {
                    if (i6 != 2) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC0186.m409(obj);
                    c1249 = obj;
                }
                c12410 = (C1249) c1249;
                if (c12410 != null && c3635.m6476()) {
                    C4042 c4043 = new C4042(C4773.m8136(c3635.m6479(), c3635.m6479().f18944.f4307.length()));
                    c4043.m7243(c12410);
                    C1249 c1249M7242 = c4043.m7241();
                    C1249 c1249M8118 = C4773.m8117(c3635.m6479(), c3635.m6479().f18944.f4307.length());
                    C4042 c4044 = new C4042(c1249M7242);
                    c4044.m7243(c1249M8118);
                    C1249 c1249M7243 = c4044.m7241();
                    int length = c12410.f4307.length() + C3346.m6109(c3635.m6479().f18943);
                    c3635.f12138.mo211(C3635.m6468(c1249M7243, AbstractC2765.m5145(length, length)));
                    c3635.m6474(enumC1546);
                    c3635.f12149.f10938 = true;
                }
                return c2358;
                C4235 c4236 = (C4235) c4235;
                if (c4236 != null) {
                    this.f11949 = 2;
                    int i7 = 0;
                    ClipData.Item itemAt = c4236.f14038.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        c1249 = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i8 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i8];
                                int i9 = i7;
                                if (AbstractC3831.m6874(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    C5086 c5087 = new C5086(annotation.getValue());
                                    Parcel parcel = (Parcel) c5087.f16877;
                                    long jM8703 = C1327.f4591;
                                    long jM8704 = jM8703;
                                    long jM8694 = C5023.f16620;
                                    long jM8695 = jM8694;
                                    C1626 c1626 = null;
                                    C5827 c5827 = null;
                                    C2848 c2848 = null;
                                    String string = null;
                                    C3917 c3917 = null;
                                    C5647 c5647 = null;
                                    C1690 c1690 = null;
                                    C5906 c5906 = null;
                                    while (true) {
                                        if (parcel.dataAvail() > b) {
                                            byte b2 = parcel.readByte();
                                            text = text;
                                            if (b2 == b) {
                                                if (parcel.dataAvail() >= 8) {
                                                    jM8703 = c5087.m8703();
                                                    text = text;
                                                }
                                            } else if (b2 == 2) {
                                                if (parcel.dataAvail() >= 5) {
                                                    jM8694 = c5087.m8694();
                                                    b = 1;
                                                }
                                            } else if (b2 == 3) {
                                                if (parcel.dataAvail() >= 4) {
                                                    c1626 = new C1626(parcel.readInt());
                                                    b = 1;
                                                    text = text;
                                                }
                                            } else if (b2 == 4) {
                                                if (parcel.dataAvail() >= 1) {
                                                    byte b3 = parcel.readByte();
                                                    C5827 c5828 = new C5827((b3 != 0 && b3 == 1) ? 1 : i9);
                                                    text = text;
                                                    c5827 = c5828;
                                                    b = 1;
                                                }
                                            } else if (b2 != 5) {
                                                if (b2 == 6) {
                                                    string = parcel.readString();
                                                } else if (b2 == 7) {
                                                    if (parcel.dataAvail() >= 5) {
                                                        jM8695 = c5087.m8694();
                                                    }
                                                } else if (b2 == 8) {
                                                    if (parcel.dataAvail() >= 4) {
                                                        c3917 = new C3917(parcel.readFloat());
                                                        b = 1;
                                                    }
                                                } else if (b2 == 9) {
                                                    if (parcel.dataAvail() >= 8) {
                                                        c5647 = new C5647(parcel.readFloat(), parcel.readFloat());
                                                        b = 1;
                                                        text = text;
                                                    }
                                                } else if (b2 == 10) {
                                                    if (parcel.dataAvail() >= 8) {
                                                        jM8704 = c5087.m8703();
                                                    }
                                                } else if (b2 != 11) {
                                                    c5086 = c5087;
                                                    if (b2 != 12) {
                                                        c5087 = c5086;
                                                    } else if (parcel.dataAvail() >= 20) {
                                                        c5087 = c5086;
                                                        c5906 = new C5906(c5086.m8703(), (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L), parcel.readFloat());
                                                    }
                                                    b = 1;
                                                } else if (parcel.dataAvail() >= 4) {
                                                    int i10 = parcel.readInt();
                                                    int i11 = (i10 & 2) != 0 ? 1 : i9;
                                                    int i12 = (i10 & 1) != 0 ? 1 : i9;
                                                    C1690 c1691 = C1690.f5636;
                                                    int i13 = i12;
                                                    C1690 c1692 = C1690.f5634;
                                                    if (i11 == 0 || i13 == 0) {
                                                        c5086 = c5087;
                                                        if (i11 != 0) {
                                                            c1690 = c1691;
                                                        } else {
                                                            if (i13 == 0) {
                                                                c1692 = C1690.f5635;
                                                            }
                                                            c1690 = c1692;
                                                        }
                                                    } else {
                                                        List listM4188 = AbstractC2164.m4188(c1691, c1692);
                                                        Integer numValueOf = Integer.valueOf(i9);
                                                        int size = listM4188.size();
                                                        c5086 = c5087;
                                                        int i14 = i9;
                                                        while (i14 < size) {
                                                            numValueOf = Integer.valueOf(((C1690) listM4188.get(i14)).f5637 | numValueOf.intValue());
                                                            i14++;
                                                            listM4188 = listM4188;
                                                        }
                                                        c1690 = new C1690(numValueOf.intValue());
                                                    }
                                                    c5087 = c5086;
                                                    b = 1;
                                                }
                                                b = 1;
                                            } else if (parcel.dataAvail() >= 1) {
                                                byte b4 = parcel.readByte();
                                                if (b4 == 0) {
                                                    i2 = i9;
                                                } else if (b4 == 1) {
                                                    i2 = 65535;
                                                } else if (b4 == 3) {
                                                    i2 = 2;
                                                } else if (b4 == 2) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = i9;
                                                }
                                                c2848 = new C2848(i2);
                                                b = 1;
                                            }
                                        } else {
                                            text = text;
                                        }
                                    }
                                    arrayList.add(new C2331(spanStart, spanEnd, new C0553(jM8703, jM8694, c1626, c5827, c2848, (AbstractC0903) null, string, jM8695, c3917, c5647, (C5668) null, jM8704, c1690, c5906, 49152)));
                                } else {
                                    text = text;
                                }
                                if (i8 != length2) {
                                    i8++;
                                    i7 = i9;
                                    text = text;
                                    b = 1;
                                }
                            }
                        } else {
                            text = text;
                        }
                        String string2 = text.toString();
                        C1249 c12411 = AbstractC5556.f18338;
                        c1249 = new C1249(arrayList.isEmpty() ? null : arrayList, string2);
                    } else {
                        c1249 = new C1249(text.toString());
                    }
                    if (c1249 == enumC2282) {
                        return enumC2282;
                    }
                    c12410 = (C1249) c1249;
                    if (c12410 != null) {
                        C4042 c4045 = new C4042(C4773.m8136(c3635.m6479(), c3635.m6479().f18944.f4307.length()));
                        c4045.m7243(c12410);
                        C1249 c1249M7244 = c4045.m7241();
                        C1249 c1249M81110 = C4773.m8117(c3635.m6479(), c3635.m6479().f18944.f4307.length());
                        C4042 c4046 = new C4042(c1249M7244);
                        c4046.m7243(c1249M81110);
                        C1249 c1249M7245 = c4046.m7241();
                        int length3 = c12410.f4307.length() + C3346.m6109(c3635.m6479().f18943);
                        c3635.f12138.mo211(C3635.m6468(c1249M7245, AbstractC2765.m5145(length3, length3)));
                        c3635.m6474(enumC1546);
                        c3635.f12149.f10938 = true;
                    }
                }
                return c2358;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f11948;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                long j = ((C1553) obj).f5241;
                return new C3592(this.f11950, (InterfaceC0443) obj2, 0).mo218(c2358);
            case 1:
                return ((C3592) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            default:
                return ((C3592) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
        }
    }
}
