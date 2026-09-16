package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۦٕؓٔؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4225 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3033 f14014 = new C3033(3);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C3033 f14012 = new C3033(2);

    /* JADX INFO: renamed from: ۥؗ */
    public static final C1064 f14009 = new C1064();

    /* JADX INFO: renamed from: ۦؑ */
    public static final C1397 f14015 = new C1397(27);

    /* JADX INFO: renamed from: ۥُ */
    public static final C0220 f14010 = new C0220("list-item-type");

    /* JADX INFO: renamed from: ۥّ */
    public static final C0220 f14011 = new C0220("bullet-list-item-level");

    /* JADX INFO: renamed from: ۦۙ */
    public static final C0220 f14020 = new C0220("ordered-list-item-number");

    /* JADX INFO: renamed from: ۥۜ */
    public static final C0220 f14013 = new C0220("heading-level");

    /* JADX INFO: renamed from: ۦٛ */
    public static final C0220 f14018 = new C0220("link-destination");

    /* JADX INFO: renamed from: ۦِ */
    public static final C0220 f14017 = new C0220("paragraph-is-in-tight-list");

    /* JADX INFO: renamed from: ۦۗ */
    public static final C0220 f14019 = new C0220("code-block-info");

    /* JADX INFO: renamed from: ۦؚ */
    public static final C4234 f14016 = new C4234(0, 0);

    /* JADX INFO: renamed from: ۥؓ */
    public static InterfaceC4367 m7435() {
        return new C4852(C2358.f7817, C0373.f1364);
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static boolean m7436(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static C3262 m7437() {
        long[] jArr = AbstractC5064.f16815;
        return new C3262();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0163  */
    /* JADX WARN: Code duplicated, block: B:113:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0172  */
    /* JADX WARN: Code duplicated, block: B:116:0x0177  */
    /* JADX WARN: Code duplicated, block: B:118:0x017b  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0183  */
    /* JADX WARN: Code duplicated, block: B:123:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x0193  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0111  */
    /* JADX WARN: Code duplicated, block: B:85:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0132  */
    /* JADX WARN: Code duplicated, block: B:97:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    /* JADX INFO: renamed from: ۥؗ */
    public static final long m7438(float f, float f2, float f3, float f4, AbstractC3292 abstractC3292) {
        int i;
        int i2;
        int i3;
        float fMo6058;
        float fMo6059;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float fMo60510;
        float fMo60511;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f5;
        if (abstractC3292.mo6055()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i20 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = i20 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            long j = ((long) (i22 | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i23 = C1327.f4593;
            return j;
        }
        if (((int) (abstractC3292.f11027 >> 32)) != 3) {
            AbstractC5545.m9276("Color only works with ColorSpaces with 3 components");
        }
        int i24 = abstractC3292.f11026;
        if (i24 == -1) {
            AbstractC5545.m9276("Unknown color space, please use a color space in ColorSpaces");
        }
        int i25 = 0;
        float fMo60512 = abstractC3292.mo6058(0);
        float fMo60513 = abstractC3292.mo6059(0);
        if (f >= fMo60512) {
            fMo60512 = f;
        }
        if (fMo60512 <= fMo60513) {
            fMo60513 = fMo60512;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fMo60513);
        int i26 = iFloatToRawIntBits3 >>> 31;
        int i27 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i28 = iFloatToRawIntBits3 & 8388607;
        if (i27 == 255) {
            i2 = i28 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i27 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else {
                if (i > 0) {
                    int i29 = i28 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i29) + 1) | (i26 << 15);
                    } else {
                        i2 = i29;
                    }
                    short s = (short) i3;
                    fMo6058 = abstractC3292.mo6058(1);
                    fMo6059 = abstractC3292.mo6059(1);
                    if (f2 >= fMo6058) {
                        fMo6058 = f2;
                    }
                    if (fMo6058 <= fMo6059) {
                        fMo6059 = fMo6058;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fMo6059);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i9 = 0;
                            i7 = 49;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                fMo60510 = abstractC3292.mo6058(2);
                                fMo60511 = abstractC3292.mo6059(2);
                                if (f3 >= fMo60510) {
                                    fMo60510 = f3;
                                }
                                if (fMo60510 <= fMo60511) {
                                    fMo60511 = fMo60510;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo60511);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i17 = i14 != 0 ? 512 : 0;
                                    i25 = 31;
                                } else {
                                    i15 = i13 - 112;
                                    if (i15 >= 31) {
                                        i17 = 0;
                                        i25 = 49;
                                    } else {
                                        if (i15 <= 0) {
                                            i16 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                            } else {
                                                i17 = i16;
                                                i25 = i15;
                                            }
                                            short s3 = (short) i18;
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            long j2 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i30 = C1327.f4593;
                                            return j2;
                                        }
                                        if (i15 >= -10) {
                                            i19 = (i14 | 8388608) >> (1 - i15);
                                            if ((i19 & 4096) != 0) {
                                                i19 += 8192;
                                            }
                                            i17 = i19 >> 13;
                                        } else {
                                            i17 = 0;
                                        }
                                    }
                                }
                                i18 = i17 | (i12 << 15) | (i25 << 10);
                                short s4 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j3 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i31 = C1327.f4593;
                                return j3;
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s5 = (short) i10;
                    fMo60510 = abstractC3292.mo6058(2);
                    fMo60511 = abstractC3292.mo6059(2);
                    if (f3 >= fMo60510) {
                        fMo60510 = f3;
                    }
                    if (fMo60510 <= fMo60511) {
                        fMo60511 = fMo60510;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo60511);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i25 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i25 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i25 = i15;
                                }
                                short s6 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j4 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s6)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i32 = C1327.f4593;
                                return j4;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i25 << 10);
                    short s7 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j5 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i33 = C1327.f4593;
                    return j5;
                }
                if (i >= -10) {
                    int i34 = (i28 | 8388608) >> (1 - i);
                    if ((i34 & 4096) != 0) {
                        i34 += 8192;
                    }
                    i2 = i34 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i26 << 15) | (i << 10);
        short s8 = (short) i3;
        fMo6058 = abstractC3292.mo6058(1);
        fMo6059 = abstractC3292.mo6059(1);
        if (f2 >= fMo6058) {
            fMo6058 = f2;
        }
        if (fMo6058 <= fMo6059) {
            fMo6059 = fMo6058;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fMo6059);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i9 = 0;
                i7 = 49;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s9 = (short) i10;
                    fMo60510 = abstractC3292.mo6058(2);
                    fMo60511 = abstractC3292.mo6059(2);
                    if (f3 >= fMo60510) {
                        fMo60510 = f3;
                    }
                    if (fMo60510 <= fMo60511) {
                        fMo60511 = fMo60510;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo60511);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i25 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i25 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i25 = i15;
                                }
                                short s10 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j6 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s10)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i35 = C1327.f4593;
                                return j6;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i25 << 10);
                    short s11 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j7 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i36 = C1327.f4593;
                    return j7;
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s12 = (short) i10;
        fMo60510 = abstractC3292.mo6058(2);
        fMo60511 = abstractC3292.mo6059(2);
        if (f3 >= fMo60510) {
            fMo60510 = f3;
        }
        if (fMo60510 <= fMo60511) {
            fMo60511 = fMo60510;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo60511);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i17 = i14 != 0 ? 512 : 0;
            i25 = 31;
        } else {
            i15 = i13 - 112;
            if (i15 >= 31) {
                i17 = 0;
                i25 = 49;
            } else {
                if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                        i25 = i15;
                    }
                    short s13 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j8 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i37 = C1327.f4593;
                    return j8;
                }
                if (i15 >= -10) {
                    i19 = (i14 | 8388608) >> (1 - i15);
                    if ((i19 & 4096) != 0) {
                        i19 += 8192;
                    }
                    i17 = i19 >> 13;
                } else {
                    i17 = 0;
                }
            }
        }
        i18 = i17 | (i12 << 15) | (i25 << 10);
        short s14 = (short) i18;
        if (f4 >= 0.0f) {
        }
        long j9 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i38 = C1327.f4593;
        return j9;
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static C3254 m7439(InterfaceC3879 interfaceC3879, String str) {
        Map mapM6407;
        C0232 c0232;
        InterfaceC0252 interfaceC0252Mo971 = interfaceC3879.mo971("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (interfaceC0252Mo971.mo533()) {
                int iM5127 = AbstractC2765.m5127(interfaceC0252Mo971, "name");
                int iM5128 = AbstractC2765.m5127(interfaceC0252Mo971, "type");
                int iM5129 = AbstractC2765.m5127(interfaceC0252Mo971, "notnull");
                int iM51210 = AbstractC2765.m5127(interfaceC0252Mo971, "pk");
                int iM51211 = AbstractC2765.m5127(interfaceC0252Mo971, "dflt_value");
                C3598 c3598 = new C3598();
                do {
                    String strMo534 = interfaceC0252Mo971.mo534(iM5127);
                    c3598.put(strMo534, new C0751((int) interfaceC0252Mo971.getLong(iM51210), 2, strMo534, interfaceC0252Mo971.mo534(iM5128), interfaceC0252Mo971.isNull(iM51211) ? null : interfaceC0252Mo971.mo534(iM51211), interfaceC0252Mo971.getLong(iM5129) != 0));
                } while (interfaceC0252Mo971.mo533());
                mapM6407 = c3598.m6407();
                AbstractC1434.m3052(interfaceC0252Mo971, null);
            } else {
                mapM6407 = C0204.f751;
                AbstractC1434.m3052(interfaceC0252Mo971, null);
            }
            InterfaceC0252 interfaceC0252Mo972 = interfaceC3879.mo971("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iM51212 = AbstractC2765.m5127(interfaceC0252Mo972, "id");
                int iM51213 = AbstractC2765.m5127(interfaceC0252Mo972, "seq");
                int iM51214 = AbstractC2765.m5127(interfaceC0252Mo972, "table");
                int iM51215 = AbstractC2765.m5127(interfaceC0252Mo972, "on_delete");
                int iM51216 = AbstractC2765.m5127(interfaceC0252Mo972, "on_update");
                List listM4199 = AbstractC2164.m4199(interfaceC0252Mo972);
                interfaceC0252Mo972.reset();
                C0232 c0233 = new C0232();
                while (interfaceC0252Mo972.mo533()) {
                    if (interfaceC0252Mo972.getLong(iM51213) == j) {
                        int i = (int) interfaceC0252Mo972.getLong(iM51212);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iM51212;
                        ArrayList<C3974> arrayList3 = new ArrayList();
                        for (Object obj : listM4199) {
                            int i3 = iM51213;
                            List list = listM4199;
                            if (((C3974) obj).f13287 == i) {
                                arrayList3.add(obj);
                            }
                            iM51213 = i3;
                            listM4199 = list;
                        }
                        int i4 = iM51213;
                        List list2 = listM4199;
                        for (C3974 c3974 : arrayList3) {
                            arrayList.add(c3974.f13284);
                            arrayList2.add(c3974.f13285);
                        }
                        c0233.add(new C0305(interfaceC0252Mo972.mo534(iM51214), interfaceC0252Mo972.mo534(iM51215), interfaceC0252Mo972.mo534(iM51216), arrayList, arrayList2));
                        iM51212 = i2;
                        iM51213 = i4;
                        listM4199 = list2;
                        j = 0;
                    }
                }
                C0232 c0232M8152 = C4773.m8152(c0233);
                AbstractC1434.m3052(interfaceC0252Mo972, null);
                InterfaceC0252 interfaceC0252Mo973 = interfaceC3879.mo971("PRAGMA index_list(`" + str + "`)");
                try {
                    int iM51217 = AbstractC2765.m5127(interfaceC0252Mo973, "name");
                    int iM51218 = AbstractC2765.m5127(interfaceC0252Mo973, "origin");
                    int iM51219 = AbstractC2765.m5127(interfaceC0252Mo973, "unique");
                    if (iM51217 == -1 || iM51218 == -1 || iM51219 == -1) {
                        AbstractC1434.m3052(interfaceC0252Mo973, null);
                        c0232 = null;
                    } else {
                        C0232 c0234 = new C0232();
                        while (interfaceC0252Mo973.mo533()) {
                            if ("c".equals(interfaceC0252Mo973.mo534(iM51218))) {
                                C2886 c2886M4203 = AbstractC2164.m4203(interfaceC3879, interfaceC0252Mo973.mo534(iM51217), interfaceC0252Mo973.getLong(iM51219) == 1);
                                if (c2886M4203 == null) {
                                    AbstractC1434.m3052(interfaceC0252Mo973, null);
                                    c0232 = null;
                                } else {
                                    c0234.add(c2886M4203);
                                }
                            }
                        }
                        C0232 c0232M8153 = C4773.m8152(c0234);
                        AbstractC1434.m3052(interfaceC0252Mo973, null);
                        c0232 = c0232M8153;
                    }
                    return new C3254(str, mapM6407, c0232M8152, c0232);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1434.m3052(interfaceC0252Mo973, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC1434.m3052(interfaceC0252Mo972, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                AbstractC1434.m3052(interfaceC0252Mo971, th5);
                throw th6;
            }
        }
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static void m7440(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f);
            f += i7;
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public static final int m7441(int i, InterfaceC4112 interfaceC4112, Object obj) {
        int iMo5819;
        return (obj == null || interfaceC4112.mo5821() == 0 || (i < interfaceC4112.mo5821() && obj.equals(interfaceC4112.mo5820(i))) || (iMo5819 = interfaceC4112.mo5819(obj)) == -1) ? i : iMo5819;
    }

    /* JADX INFO: renamed from: ۥَ */
    public static C4234 m7442(int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return new C4234(0, i);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final long m7443(long j) {
        long j2 = j << 32;
        int i = C1327.f4593;
        return j2;
    }

    /* JADX INFO: renamed from: ۥِ */
    public static final Rect m7444(C4730 c4730) {
        return new Rect(c4730.f15612, c4730.f15611, c4730.f15610, c4730.f15613);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static long m7445(int i, int i2, int i3) {
        return m7468(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    /* JADX INFO: renamed from: ۥْ */
    public static final long m7446(float f, float f2, float f3, float f4, AbstractC3292 abstractC3292) {
        int i;
        int i2;
        int i3;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (abstractC3292.mo6055()) {
            long j = ((long) ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f)))) << 32;
            int i18 = C1327.f4593;
            return j;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f);
        int i19 = iFloatToRawIntBits3 >>> 31;
        int i20 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i21 = iFloatToRawIntBits3 & 8388607;
        int i22 = 49;
        int i23 = 0;
        if (i20 == 255) {
            i2 = i21 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i20 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else {
                if (i > 0) {
                    int i24 = i21 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i24) + 1) | (i19 << 15);
                    } else {
                        i2 = i24;
                    }
                    short s = (short) i3;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f2);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i7 = 49;
                            i9 = 0;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i15 = i13 - 112;
                                    if (i15 < 31) {
                                        if (i15 <= 0) {
                                            i23 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                            } else {
                                                i22 = i15;
                                            }
                                        } else if (i15 >= -10) {
                                            i17 = (i14 | 8388608) >> (1 - i15);
                                            if ((i17 & 4096) != 0) {
                                                i17 += 8192;
                                            }
                                            i22 = 0;
                                            i23 = i17 >> 13;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3292.f11026) & 63);
                                    int i25 = C1327.f4593;
                                    return jMax;
                                }
                                i23 = i14 == 0 ? 0 : 512;
                                i22 = 31;
                                i16 = (i12 << 15) | (i22 << 10) | i23;
                                long jMax2 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3292.f11026) & 63);
                                int i26 = C1327.f4593;
                                return jMax2;
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s3 = (short) i10;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3292.f11026) & 63);
                        int i27 = C1327.f4593;
                        return jMax3;
                    }
                    i23 = i14 == 0 ? 0 : 512;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    long jMax4 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3292.f11026) & 63);
                    int i28 = C1327.f4593;
                    return jMax4;
                }
                if (i >= -10) {
                    int i29 = (i21 | 8388608) >> (1 - i);
                    if ((i29 & 4096) != 0) {
                        i29 += 8192;
                    }
                    i2 = i29 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i19 << 15) | (i << 10);
        short s4 = (short) i3;
        iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i9 = 0;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s5 = (short) i10;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3292.f11026) & 63);
                        int i210 = C1327.f4593;
                        return jMax5;
                    }
                    i23 = i14 == 0 ? 0 : 512;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    long jMax6 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3292.f11026) & 63);
                    int i211 = C1327.f4593;
                    return jMax6;
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s6 = (short) i10;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i15 = i13 - 112;
            if (i15 < 31) {
                if (i15 <= 0) {
                    i23 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                    } else {
                        i22 = i15;
                    }
                } else if (i15 >= -10) {
                    i17 = (i14 | 8388608) >> (1 - i15);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i22 = 0;
                    i23 = i17 >> 13;
                } else {
                    i22 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3292.f11026) & 63);
            int i212 = C1327.f4593;
            return jMax7;
        }
        i23 = i14 == 0 ? 0 : 512;
        i22 = 31;
        i16 = (i12 << 15) | (i22 << 10) | i23;
        long jMax8 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3292.f11026) & 63);
        int i213 = C1327.f4593;
        return jMax8;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static final void m7447(C3557 c3557, C5362 c5362, int i) {
        C5362 c5363;
        c5362.m8979(-980519676);
        new C4441(new long[]{-6397315095378012014L, 3996981477392323371L, -4525624836101614653L, -4086977604576489383L, 2900642366684870973L, -2724046277007303139L, 5794938306565713406L, -8107826262296044960L, -8575819255367430848L, 4718499625141401567L, 900036040071682959L}).toString();
        int i2 = 2;
        int i3 = (c5362.m8977(c3557) ? 4 : 2) | i;
        int i4 = 1;
        if (c5362.m9011(i3 & 1, (i3 & 3) != 2)) {
            App app = App.f407;
            C1443 c1443 = AbstractC2776.m5217().f410;
            C1542 c1542 = AbstractC2539.f8451;
            Object obj = c1542.f5218;
            String str = c1542.f5219;
            boolean z = C1443.f4940;
            boolean zBooleanValue = ((Boolean) c1443.m3068(obj, str)).booleanValue();
            new C4441(new long[]{3576601853293997293L, -5173765115838824725L, -2380534215160408584L, 6387264392090239513L, -5124026212751681760L, 4350633393140115690L}).toString();
            boolean z2 = (i3 & 14) == 4 || c5362.m8977(c3557);
            Object objM8999 = c5362.m8999();
            if (z2 || objM8999 == C2850.f9517) {
                objM8999 = new C3553(c3557, i4);
                c5362.m8987(objM8999);
            }
            c5363 = c5362;
            AbstractC0949.m1925(R.string.settings_updater_title, R.string.settings_updater_summary, zBooleanValue, null, (InterfaceC4745) objM8999, c5363, 0);
        } else {
            c5363 = c5362;
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5045(c3557, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static ColorStateList m7448(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM7481;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM7481 = m7481(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM7481;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final void m7449(C3262 c3262, Object obj, Object obj2) {
        int iM6017 = c3262.m6017(obj);
        boolean z = iM6017 < 0;
        Object obj3 = z ? null : c3262.f10944[iM6017];
        if (obj3 != null) {
            if (obj3 instanceof C3639) {
                ((C3639) obj3).m6495(obj2);
            } else if (obj3 != obj2) {
                C3639 c3639 = new C3639();
                c3639.m6495(obj3);
                c3639.m6495(obj2);
                obj2 = c3639;
            }
            obj2 = obj3;
        }
        if (!z) {
            c3262.f10944[iM6017] = obj2;
            return;
        }
        int i = ~iM6017;
        c3262.f10947[i] = obj;
        c3262.f10944[i] = obj2;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static final long m7450(long j, long j2, float f) {
        C3568 c3568 = C3444.f11443;
        long jM2828 = C1327.m2828(j, c3568);
        long jM2829 = C1327.m2828(j2, c3568);
        float fM2823 = C1327.m2823(jM2828);
        float fM2830 = C1327.m2830(jM2828);
        float fM2825 = C1327.m2825(jM2828);
        float fM2829 = C1327.m2829(jM2828);
        float fM2824 = C1327.m2823(jM2829);
        float fM2831 = C1327.m2830(jM2829);
        float fM2826 = C1327.m2825(jM2829);
        float fM28210 = C1327.m2829(jM2829);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return C1327.m2828(m7446(AbstractC4593.m7993(fM2830, fM2831, f), AbstractC4593.m7993(fM2825, fM2826, f), AbstractC4593.m7993(fM2829, fM28210, f), AbstractC4593.m7993(fM2823, fM2824, f), c3568), C1327.m2824(j2));
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static final long m7451(long j, long j2) {
        float f;
        float f2;
        long jM2828 = C1327.m2828(j, C1327.m2824(j2));
        float fM2823 = C1327.m2823(j2);
        float fM2824 = C1327.m2823(jM2828);
        float f3 = 1.0f - fM2824;
        float f4 = (fM2823 * f3) + fM2824;
        float fM2830 = C1327.m2830(jM2828);
        float fM2831 = C1327.m2830(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fM2831 * fM2823) * f3) + (fM2830 * fM2824)) / f4;
        }
        float fM2825 = C1327.m2825(jM2828);
        float fM2826 = C1327.m2825(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fM2826 * fM2823) * f3) + (fM2825 * fM2824)) / f4;
        }
        float fM2829 = C1327.m2829(jM2828);
        float fM28210 = C1327.m2829(j2);
        if (f4 != 0.0f) {
            f5 = (((fM28210 * fM2823) * f3) + (fM2829 * fM2824)) / f4;
        }
        return m7446(f, f2, f5, f4, C1327.m2824(j2));
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static AbstractC3191 m7452(AbstractC3191 abstractC3191) {
        if (abstractC3191 instanceof C4336) {
            C4336 c4336 = (C4336) abstractC3191;
            if (c4336.f14316 == AbstractC3831.m6841()) {
                c4336.f14315 = null;
                return abstractC3191;
            }
        }
        if (abstractC3191 instanceof C2764) {
            C2764 c2764 = (C2764) abstractC3191;
            if (c2764.f9152 == AbstractC3831.m6841()) {
                c2764.f9151 = null;
                return abstractC3191;
            }
        }
        AbstractC3191 abstractC3191M3271 = AbstractC1538.m3271(abstractC3191, null, false);
        abstractC3191M3271.m5883();
        return abstractC3191M3271;
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static final InterfaceC0705 m7453(InterfaceC0705 interfaceC0705, InterfaceC4745 interfaceC4745) {
        return interfaceC0705.mo1571(new C2652(interfaceC4745));
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static void m7454(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                C1078.m2273(AbstractC4031.m7228("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2).concat(AbstractC4031.m7223(str2) ? "" : ": ".concat(str)));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m7455(int i, C5362 c5362) {
        c5362.m8979(-12676607);
        new C4441(new long[]{5202181105632095365L, 242149023062222566L, -3018629169533695764L, 6920791993170690671L, 1457981794023661050L, -1667152873758344918L, 9014555652017762107L, -816755431011122449L}).toString();
        if (c5362.m9011(i & 1, i != 0)) {
            AbstractC0949.m1939(R.string.settings_auto_title, R.string.settings_auto_summary, AbstractC2539.f8457, c5362, 0);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5338(i, 7);
        }
    }

    /* JADX INFO: renamed from: ۥۘ */
    public static final RectF m7456(C2793 c2793) {
        return new RectF(c2793.f9343, c2793.f9342, c2793.f9341, c2793.f9344);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    /* JADX WARN: Code duplicated, block: B:62:0x0123  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۜ */
    public static final void m7457(final InterfaceC4448 interfaceC4448, InterfaceC0705 interfaceC0705, boolean z, C2195 c2195, InterfaceC2864 interfaceC2864, final C0857 c0857, C5362 c5362, final int i, final int i2) {
        InterfaceC0705 interfaceC0706;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        final InterfaceC2864 interfaceC2865;
        final InterfaceC0705 interfaceC0707;
        final boolean z4;
        final C2195 c2196;
        C5863 c5863M8965;
        InterfaceC0705 interfaceC0708;
        long j;
        C2917 c2917;
        C2195 c2197;
        long j2;
        long jM2826;
        C2195 c2198;
        InterfaceC2864 interfaceC2864M546;
        int i5;
        boolean z5;
        c5362.m8979(1413012038);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i | 48;
            interfaceC0706 = interfaceC0705;
        } else if ((i & 48) == 0) {
            interfaceC0706 = interfaceC0705;
            i3 = (c5362.m8963(interfaceC0706) ? 32 : 16) | i;
        } else {
            interfaceC0706 = interfaceC0705;
            i3 = i;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= c5362.m9006(z2) ? 256 : 128;
            }
            i4 = i3 | 91136;
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c5362.m9011(i4 & 1, z3)) {
                c5362.m8971();
                if ((i & 1) != 0 || c5362.m8969()) {
                    if (i6 != 0) {
                        interfaceC0708 = C4217.f13994;
                    } else {
                        interfaceC0708 = interfaceC0706;
                    }
                    boolean z6 = i7 == 0 ? z2 : true;
                    j = ((C1327) c5362.m8997(AbstractC0194.f721)).f4595;
                    c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                    c2197 = c2917.f9779;
                    if (c2197 == null) {
                        long j3 = C1327.f4592;
                        C2195 c2199 = new C2195(j3, j, j3, C1327.m2826(j, 0.38f, 14));
                        c2917.f9779 = c2199;
                        c2197 = c2199;
                    }
                    j2 = c2197.f7284;
                    if (C4462.m7744(j2, j)) {
                        c2198 = c2197;
                    } else {
                        jM2826 = C1327.m2826(j, 0.38f, 14);
                        long j4 = c2197.f7285;
                        long j5 = c2197.f7283;
                        if (j == 16) {
                            j = j2;
                        }
                        if (jM2826 == 16) {
                            jM2826 = c2197.f7286;
                        }
                        c2198 = new C2195(j4, j, j5, jM2826);
                    }
                    interfaceC2864M546 = AbstractC0265.m546(7, c5362);
                    i5 = i4 & (-465921);
                    z5 = z6;
                    c2196 = c2198;
                } else {
                    c5362.m8982();
                    int i8 = i4 & (-465921);
                    InterfaceC0705 interfaceC0709 = interfaceC0706;
                    i5 = i8;
                    interfaceC0708 = interfaceC0709;
                    interfaceC2864M546 = interfaceC2864;
                    z5 = z2;
                    c2196 = c2195;
                }
                c5362.m8964();
                m7482(interfaceC0708, interfaceC4448, z5, interfaceC2864M546, c2196, c0857, c5362, (i5 & 896) | ((i5 >> 3) & 14) | 48 | 1769472);
                interfaceC2865 = interfaceC2864M546;
                z4 = z5;
                interfaceC0707 = interfaceC0708;
            } else {
                c5362.m8982();
                interfaceC2865 = interfaceC2864;
                interfaceC0707 = interfaceC0706;
                z4 = z2;
                c2196 = c2195;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥؙؔؑؕ
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC4225.m7457(interfaceC4448, interfaceC0707, z4, c2196, interfaceC2865, c0857, (C5362) obj, AbstractC3831.m6835(i | 1), i2);
                        return C2358.f7817;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        i4 = i3 | 91136;
        if ((599187 & i4) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c5362.m9011(i4 & 1, z3)) {
            c5362.m8971();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    interfaceC0708 = C4217.f13994;
                } else {
                    interfaceC0708 = interfaceC0706;
                }
                if (i7 == 0) {
                }
                j = ((C1327) c5362.m8997(AbstractC0194.f721)).f4595;
                c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                c2197 = c2917.f9779;
                if (c2197 == null) {
                    long j6 = C1327.f4592;
                    C2195 c21910 = new C2195(j6, j, j6, C1327.m2826(j, 0.38f, 14));
                    c2917.f9779 = c21910;
                    c2197 = c21910;
                }
                j2 = c2197.f7284;
                if (C4462.m7744(j2, j)) {
                    c2198 = c2197;
                } else {
                    jM2826 = C1327.m2826(j, 0.38f, 14);
                    long j7 = c2197.f7285;
                    long j8 = c2197.f7283;
                    if (j == 16) {
                        j = j2;
                    }
                    if (jM2826 == 16) {
                        jM2826 = c2197.f7286;
                    }
                    c2198 = new C2195(j7, j, j8, jM2826);
                }
                interfaceC2864M546 = AbstractC0265.m546(7, c5362);
                i5 = i4 & (-465921);
                z5 = z6;
                c2196 = c2198;
            } else {
                if (i6 != 0) {
                    interfaceC0708 = C4217.f13994;
                } else {
                    interfaceC0708 = interfaceC0706;
                }
                if (i7 == 0) {
                }
                j = ((C1327) c5362.m8997(AbstractC0194.f721)).f4595;
                c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                c2197 = c2917.f9779;
                if (c2197 == null) {
                    long j9 = C1327.f4592;
                    C2195 c21911 = new C2195(j9, j, j9, C1327.m2826(j, 0.38f, 14));
                    c2917.f9779 = c21911;
                    c2197 = c21911;
                }
                j2 = c2197.f7284;
                if (C4462.m7744(j2, j)) {
                    c2198 = c2197;
                } else {
                    jM2826 = C1327.m2826(j, 0.38f, 14);
                    long j10 = c2197.f7285;
                    long j11 = c2197.f7283;
                    if (j == 16) {
                        j = j2;
                    }
                    if (jM2826 == 16) {
                        jM2826 = c2197.f7286;
                    }
                    c2198 = new C2195(j10, j, j11, jM2826);
                }
                interfaceC2864M546 = AbstractC0265.m546(7, c5362);
                i5 = i4 & (-465921);
                z5 = z6;
                c2196 = c2198;
            }
            c5362.m8964();
            m7482(interfaceC0708, interfaceC4448, z5, interfaceC2864M546, c2196, c0857, c5362, (i5 & 896) | ((i5 >> 3) & 14) | 48 | 1769472);
            interfaceC2865 = interfaceC2864M546;
            z4 = z5;
            interfaceC0707 = interfaceC0708;
        } else {
            c5362.m8982();
            interfaceC2865 = interfaceC2864;
            interfaceC0707 = interfaceC0706;
            z4 = z2;
            c2196 = c2195;
        }
        c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥؙؔؑؕ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC4225.m7457(interfaceC4448, interfaceC0707, z4, c2196, interfaceC2865, c0857, (C5362) obj, AbstractC3831.m6835(i | 1), i2);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static long m7458(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ۥۡ */
    public static final boolean m7459(C3262 c3262, Object obj, Object obj2) {
        Object objM6027 = c3262.m6027(obj);
        if (objM6027 == null) {
            return false;
        }
        if (!(objM6027 instanceof C3639)) {
            if (!objM6027.equals(obj2)) {
                return false;
            }
            c3262.m6026(obj);
            return true;
        }
        C3639 c3639 = (C3639) objM6027;
        boolean zM6497 = c3639.m6497(obj2);
        if (zM6497 && c3639.m6502()) {
            c3262.m6026(obj);
        }
        return zM6497;
    }

    /* JADX INFO: renamed from: ۥۢ */
    public static final C2793 m7460(Rect rect) {
        return new C2793(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۣ */
    public static final void m7461(final C0346 c0346, final InterfaceC4367 interfaceC4367, C5362 c5362, int i) {
        C5362 c5363;
        final int i2;
        C5362 c5364 = c5362;
        c5364.m8979(1189969882);
        new C4441(new long[]{-7591515778210414409L, -3008446339117456217L, -1828370157393262160L, -8008376076828546608L, -7061576202001658895L, -904950636301582254L, -3030015976967644420L, -265093283191434110L, -5471913376906600829L, -3448257458099532724L, 6554317346060231906L, -8066459861431225886L, 6259960949794111119L}).toString();
        int i3 = i | (c5364.m8963(c0346) ? 4 : 2);
        final int i4 = 0;
        if (c5364.m9011(i3 & 1, (i3 & 19) != 18)) {
            boolean zM6874 = AbstractC3831.m6874(interfaceC4367.getValue(), c0346.f1277);
            C4274 c4274 = C1298.f4423;
            C4182 c4182 = AbstractC4410.f14521;
            new C4441(new long[]{1976888043160427243L, 6943658055024107732L, 1363053855908174980L, 2423268842332808907L, 1637527252826642890L, -4148916455574742848L}).toString();
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            Object objM8999 = c5364.m8999();
            Object obj = C2850.f9517;
            if (z || objM8999 == obj) {
                objM8999 = new InterfaceC4448() { // from class: ۥٟؑؓ۟
                    @Override // p000.InterfaceC4448
                    /* JADX INFO: renamed from: ۥۣ */
                    public final Object mo449() {
                        int i6 = i4;
                        C2358 c2358 = C2358.f7817;
                        C0346 c0347 = c0346;
                        InterfaceC4367 interfaceC4368 = interfaceC4367;
                        switch (i6) {
                            case 0:
                                interfaceC4368.setValue(c0347.f1277);
                                break;
                            default:
                                interfaceC4368.setValue(c0347.f1277);
                                break;
                        }
                        return c2358;
                    }
                };
                c5364.m8987(objM8999);
            }
            InterfaceC0705 interfaceC0705M6865 = AbstractC3831.m6865(c4182, zM6874, (InterfaceC4448) objM8999);
            new C4441(new long[]{6434160977134745898L, 2149591801739394641L, -9212340877638200827L, 3733699532661000297L, 5045119584480162616L, -8503384590523191537L, -6762440432212125657L, -8183256183404247340L, -7377193696078428882L, -8545006432281013635L, 8230959603998716825L, 2851031070670723966L, 8621047660850701061L, 8713088754319996056L}).toString();
            C3668 c3668M6047 = AbstractC3287.m6047(f14014, c4274, c5364, 48);
            new C4441(new long[]{8720341539173098933L, 1561339357376946804L, -1495821074955408L, -3105234015379561758L, 2366680442125517678L, -994377707984116160L, 7765678642756990294L, 314592925048303836L, 2807621305129383867L, 6269762849582965765L, -3090025872570102783L, -5349783310415239698L}).toString();
            int iHashCode = Long.hashCode(c5364.f17657);
            C2103 c2103M8994 = c5364.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5364, interfaceC0705M6865);
            InterfaceC4576.f15106.getClass();
            InterfaceC4448 interfaceC4448 = C0849.f3049;
            new C4441(new long[]{2781515315348663899L, -8068496379246527506L, 3197914174957805093L, 7836146036017570096L, 5334401433366750769L, -2197048625376393412L, 4074881224475485373L, -1060925728831165484L, -828843200406610107L, 5881813297810129926L, 1288021684630120356L, -4251060001660874189L}).toString();
            c5364.m8983();
            if (c5364.f17668) {
                c5364.m9005(interfaceC4448);
            } else {
                c5364.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5364, c3668M6047);
            AbstractC0993.m2127(C0849.f3047, c5364, c2103M8994);
            AbstractC0993.m2127(C0849.f3053, c5364, Integer.valueOf(iHashCode));
            AbstractC0993.m2146(c5364, C0849.f3050);
            AbstractC0993.m2127(C0849.f3052, c5364, interfaceC0705M2161);
            new C4441(new long[]{-1045177225260900337L, -3793684000315345967L, 3111312864570650142L, -5593589054423965849L, -4879228221107455647L}).toString();
            new C4441(new long[]{-7243317877417180918L, 6221070913160656145L, 4508879626841959382L, 2369512838701627192L, 7815775218130853544L, 4463558651193487130L, -4027408203433830491L, 5870248428581183008L, -7938606827820556981L, -2267261654472945172L, -4853244564651267422L, 6341114331375313000L}).toString();
            new C4441(new long[]{7176729530920882761L, -4089830458275686698L, -1141226965904896788L, 4264300719998663366L, -7439115845471185703L, -6687848402161256288L}).toString();
            boolean z2 = i5 == 4;
            Object objM89910 = c5364.m8999();
            if (z2 || objM89910 == obj) {
                i2 = 1;
                objM89910 = new InterfaceC4448() { // from class: ۥٟؑؓ۟
                    @Override // p000.InterfaceC4448
                    /* JADX INFO: renamed from: ۥۣ */
                    public final Object mo449() {
                        int i6 = i2;
                        C2358 c2358 = C2358.f7817;
                        C0346 c0347 = c0346;
                        InterfaceC4367 interfaceC4368 = interfaceC4367;
                        switch (i6) {
                            case 0:
                                interfaceC4368.setValue(c0347.f1277);
                                break;
                            default:
                                interfaceC4368.setValue(c0347.f1277);
                                break;
                        }
                        return c2358;
                    }
                };
                c5364.m8987(objM89910);
            } else {
                i2 = 1;
            }
            AbstractC4489.m7779(zM6874, (InterfaceC4448) objM89910, null, false, null, c5364, 0);
            AbstractC0495.m1105(C3133.m5804(c0346.f1276, c5364), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((C4413) c5364.m8997(AbstractC4957.f16399)).f14550, c5362, 0, 0, 131070);
            C5362 c5365 = c5362;
            c5365.m9009(i2);
            c5363 = c5365;
        } else {
            c5364.m8982();
            c5363 = c5364;
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4762(i, 14, c0346, interfaceC4367);
        }
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static Object m7462(C3298 c3298, InterfaceC4448 interfaceC4448) {
        AbstractC3191 c4336;
        AbstractC3191 abstractC3191 = (AbstractC3191) AbstractC1538.f5206.get();
        if (abstractC3191 instanceof C4336) {
            C4336 c4337 = (C4336) abstractC3191;
            if (c4337.f14316 == AbstractC3831.m6841()) {
                InterfaceC4745 interfaceC4745 = c4337.f14315;
                InterfaceC4745 interfaceC4746 = c4337.f14313;
                try {
                    ((C4336) abstractC3191).f14315 = AbstractC1538.m3285(c3298, interfaceC4745, true);
                    ((C4336) abstractC3191).f14313 = interfaceC4746;
                    return interfaceC4448.mo449();
                } finally {
                    c4337.f14315 = interfaceC4745;
                    c4337.f14313 = interfaceC4746;
                }
            }
        }
        if (abstractC3191 == null || (abstractC3191 instanceof C5038)) {
            c4336 = new C4336(abstractC3191 instanceof C5038 ? (C5038) abstractC3191 : null, c3298, null, true, false);
        } else {
            c4336 = abstractC3191.mo4469(c3298);
        }
        try {
            AbstractC3191 abstractC3191M5883 = c4336.m5883();
            try {
                Object objMo449 = interfaceC4448.mo449();
                AbstractC3191.m5876(abstractC3191M5883);
                c4336.mo2657();
                return objMo449;
            } catch (Throwable th) {
                AbstractC3191.m5876(abstractC3191M5883);
                throw th;
            }
        } catch (Throwable th2) {
            c4336.mo2657();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۥۥ */
    public static void m7463(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                C1078.m2272(AbstractC3761.m6621(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        activity.requestPermissions(strArr, i);
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static Drawable m7464(Context context, int i) {
        return C0141.m304().m311(context, i);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1.mo978(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ۥۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7465(p000.InterfaceC4161 r7, p000.InterfaceC4541 r8, boolean r9, p000.AbstractC0772 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof p000.C2729
            if (r0 == 0) goto L13
            r0 = r10
            ۥۥّؓؖ r0 = (p000.C2729) r0
            int r1 = r0.f9036
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9036 = r1
            goto L18
        L13:
            ۥۥّؓؖ r0 = new ۥۥّؓؖ
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f9038
            int r1 = r0.f9036
            r2 = 2
            r3 = 1
            r4 = 0
            ۥٟۚؕۨ r5 = p000.EnumC2282.f7590
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            boolean r9 = r0.f9037
            ۥَٝؕٚ r7 = r0.f9035
            ۦؚٚؓٓ r8 = r0.f9033
            ۦٔؑۢٞ r1 = r0.f9034
            p000.AbstractC0186.m409(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r7)
            return r4
        L3d:
            boolean r9 = r0.f9037
            ۥَٝؕٚ r7 = r0.f9035
            ۦؚٚؓٓ r8 = r0.f9033
            ۦٔؑۢٞ r1 = r0.f9034
            p000.AbstractC0186.m409(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            p000.AbstractC0186.m409(r10)
            boolean r10 = r7 instanceof p000.C0655
            if (r10 != 0) goto La9
            ۥَٝؕٚ r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.f9034 = r7     // Catch: java.lang.Throwable -> L35
            r0.f9033 = r8     // Catch: java.lang.Throwable -> L35
            r0.f9035 = r10     // Catch: java.lang.Throwable -> L35
            r0.f9037 = r9     // Catch: java.lang.Throwable -> L35
            r0.f9036 = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.m3745(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L65
            goto L85
        L65:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.m3744()     // Catch: java.lang.Throwable -> L35
            r0.f9034 = r1     // Catch: java.lang.Throwable -> L35
            r0.f9033 = r8     // Catch: java.lang.Throwable -> L35
            r0.f9035 = r7     // Catch: java.lang.Throwable -> L35
            r0.f9037 = r9     // Catch: java.lang.Throwable -> L35
            r0.f9036 = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.mo978(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L85:
            return r5
        L86:
            if (r9 == 0) goto L8b
            r8.mo7865(r4)
        L8b:
            ۥۜؑؒؑ r7 = p000.C2358.f7817
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto La8
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L99
            r4 = r7
            java.util.concurrent.CancellationException r4 = (java.util.concurrent.CancellationException) r4
        L99:
            if (r4 != 0) goto La5
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r4.<init>(r9)
            r4.initCause(r7)
        La5:
            r8.mo7865(r4)
        La8:
            throw r10
        La9:
            ۥٍؘُؒ r7 = (p000.C0655) r7
            java.lang.Throwable r7 = r7.f2433
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC4225.m7465(ۦٔؑۢٞ, ۦؚٚؓٓ, boolean, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۥۨ */
    public static void m7466(AbstractC3191 abstractC3191, AbstractC3191 abstractC3192, InterfaceC4745 interfaceC4745) {
        if (abstractC3191 != abstractC3192) {
            abstractC3192.getClass();
            AbstractC3191.m5876(abstractC3191);
            abstractC3192.mo2657();
        } else if (abstractC3191 instanceof C4336) {
            ((C4336) abstractC3191).f14315 = interfaceC4745;
        } else if (abstractC3191 instanceof C2764) {
            ((C2764) abstractC3191).f9151 = interfaceC4745;
        } else {
            C5028.m8449(abstractC3191, "Non-transparent snapshot was reused: ");
        }
    }

    /* JADX INFO: renamed from: ۦ */
    public static final C2793 m7467(RectF rectF) {
        return new C2793(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final long m7468(int i) {
        long j = ((long) i) << 32;
        int i2 = C1327.f4593;
        return j;
    }

    /* JADX INFO: renamed from: ۦؒ */
    public static C4714 m7469(String... strArr) {
        if (strArr.length % 2 != 0) {
            C1078.m2272("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                C1078.m2272("Headers cannot be null");
                return null;
            }
            strArr2[i2] = AbstractC0684.m9760(str).toString();
        }
        int iM8638 = C5063.m8638(0, strArr2.length - 1, 2);
        if (iM8638 >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                m7480(str2);
                m7454(str3, str2);
                if (i == iM8638) {
                    break;
                }
                i += 2;
            }
        }
        return new C4714(strArr2);
    }

    /* JADX INFO: renamed from: ۦؔ */
    public static final int m7470(long j) {
        float[] fArr = C3444.f11438;
        return (int) (C1327.m2828(j, C3444.f11429) >>> 32);
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static final float m7471(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static Object m7472(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.get(arrayList.size() - 1);
        }
        C0178.m381();
        return null;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static AbstractC3191 m7473() {
        return (AbstractC3191) AbstractC1538.f5206.get();
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final void m7474(C3557 c3557, C5362 c5362, int i) {
        c5362.m8979(149517976);
        new C4441(new long[]{-1283259184437728923L, -4427390500697368447L, 3665220507972874270L, -3960069801435028691L, 5596002472876189501L, 600365703922397811L, -4596684627721945416L, 1027121811462273641L, 5716362514432514235L, 2856077775161612086L, -4694419923765942598L, 5155954605059760219L, -1719768232808038701L}).toString();
        int i2 = (c5362.m8977(c3557) ? 4 : 2) | i;
        int i3 = 1;
        if (c5362.m9011(i2 & 1, (i2 & 3) != 2)) {
            new C4441(new long[]{-1319010978302036721L, -3311884490021638596L, 7676329273163856064L, -1455305984761255259L, 4173062920623951929L, -752707745127779896L}).toString();
            Object objM8999 = c5362.m8999();
            C4036 c4036 = C2850.f9517;
            if (objM8999 == c4036) {
                objM8999 = AbstractC2774.m5183(Boolean.FALSE);
                c5362.m8987(objM8999);
            }
            InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM8999;
            new C4441(new long[]{8361180659297322631L, 141933353622730337L, 2548339095197199292L, -3767811590900150711L, -8565607376181317973L, 879820333912601961L}).toString();
            Object objM89910 = c5362.m8999();
            if (objM89910 == c4036) {
                objM89910 = new C0681(interfaceC4367, 11);
                c5362.m8987(objM89910);
            }
            AbstractC1434.m3045(R.string.settings_reset_title, R.string.settings_reset_summary, null, (InterfaceC4448) objM89910, c5362, 3072, 4);
            if (((Boolean) interfaceC4367.getValue()).booleanValue()) {
                c5362.m8957(409245485);
                new C4441(new long[]{-9198085932823912165L, -1180002745791907259L, 4839522734392290549L, 2013728960934957791L, -2234435262562019302L, 2703380695932519648L}).toString();
                C1347 c1347 = new C1347();
                c1347.addAll(AbstractC2164.m4188(EnumC1029.f3634.f3638, EnumC1029.f3635.f3638));
                new C4441(new long[]{-4451104956187518170L, -7239615074120093079L, -7622479071713435828L, -3548684748061088835L, 9123965014487075728L, -4901554922011021422L}).toString();
                Object objM89911 = c5362.m8999();
                if (objM89911 == c4036) {
                    objM89911 = new C0681(interfaceC4367, 12);
                    c5362.m8987(objM89911);
                }
                AbstractC0186.m425((InterfaceC4448) objM89911, null, AbstractC3925.m7034(1828264742, new C2334(c1347, c3557, interfaceC4367, i3), c5362), c5362, 390, 2);
                c5362.m9009(false);
            } else {
                c5362.m8957(411179978);
                c5362.m9009(false);
            }
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5045(c3557, i, i3);
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static final void m7475(C3557 c3557, C5362 c5362, int i) {
        C5362 c5363 = c5362;
        c5363.m8979(-714210091);
        new C4441(new long[]{-908957102761822872L, 9028689669268094589L, 4854843496582609037L, -4223348141048341874L, 5340230454802847070L, -1176544021782516138L, 8668682442086518048L, 4574972032318222889L, -1375896536618060516L, -5920907522920243376L, 5506695985061328167L, -3364771741879441554L, 1911583759371623067L, -8442500898436387044L, -3983875736590751612L, -8084073924751806563L}).toString();
        int i2 = 4;
        int i3 = (c5363.m8977(c3557) ? 4 : 2) | i;
        int i4 = 0;
        int i5 = 6;
        if (c5363.m9011(i3 & 1, (i3 & 3) != 2)) {
            new C4441(new long[]{882396977840280117L, -3894238506112388576L, -9137286275023828769L, -2203468159644707136L, -7362891852522504663L, -8835728760817596961L}).toString();
            Object objM8999 = c5363.m8999();
            C4036 c4036 = C2850.f9517;
            if (objM8999 == c4036) {
                objM8999 = AbstractC2774.m5183(Boolean.FALSE);
                c5363.m8987(objM8999);
            }
            InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM8999;
            new C4441(new long[]{-6550822156150269168L, -2642609433548097304L, -7819794483061748489L, -8705532369576245918L, -2616728641045241486L, 3512182512322281358L}).toString();
            Object objM89910 = c5363.m8999();
            if (objM89910 == c4036) {
                objM89910 = new C3985();
                c5363.m8987(objM89910);
            }
            C3985 c3985 = (C3985) objM89910;
            new C4441(new long[]{8668933752537952581L, 8233565698277105423L, -5733495062152182045L, -6594507757196345025L, 2672759885209118178L, -2957544857058482194L}).toString();
            Object objM89911 = c5363.m8999();
            if (objM89911 == c4036) {
                c3557.getClass();
                objM89911 = AbstractC2774.m5183(C3557.m6354());
                c5363.m8987(objM89911);
            }
            InterfaceC4367 interfaceC4368 = (InterfaceC4367) objM89911;
            new C4441(new long[]{-2295826344266759993L, 3322607632907963225L, -7453334617045581174L, 8386876444326891714L, -8743596866771230620L, 103552458019704822L}).toString();
            Object objM89912 = c5363.m8999();
            if (objM89912 == c4036) {
                objM89912 = new C0681(interfaceC4367, 13);
                c5363.m8987(objM89912);
            }
            AbstractC1434.m3045(R.string.settings_delay_title, R.string.settings_delay_summary, null, (InterfaceC4448) objM89912, c5362, 3072, 4);
            if (((Boolean) interfaceC4367.getValue()).booleanValue()) {
                c5362.m8957(235679648);
                new C4441(new long[]{5683688327407061926L, 4791015894954263052L, -9023547405703785360L, -6966822961439244804L, 8751564539294488805L, 2288326384797533393L, -9153844023214972932L, 5354947190143602368L, 5238795187177209410L, -1808939718535488720L}).toString();
                new C4441(new long[]{3813691313968551563L, 1240420032435529932L, -328798019227448655L, -8673669208595500209L, -794773955704356059L, 2827709424434970544L}).toString();
                boolean z = (i3 & 14) == 4 || c5362.m8977(c3557);
                Object objM89913 = c5362.m8999();
                if (z || objM89913 == c4036) {
                    objM89913 = new C4037(c3557, interfaceC4367, interfaceC4368, i4);
                    c5362.m8987(objM89913);
                }
                c5363 = c5362;
                AbstractC0186.m425((InterfaceC4448) objM89913, null, AbstractC3925.m7034(-694586141, new C2231(c3985, c3557, interfaceC4368, interfaceC4367, 1), c5362), c5363, 384, 2);
                new C4441(new long[]{7297810208423453784L, -7043138371260587492L, 4807345647183999348L, 4807366525249860834L, 8855592019397061998L, 9039314853117994579L}).toString();
                Object objM89914 = c5363.m8999();
                if (objM89914 == c4036) {
                    objM89914 = new C0876(c3985, null, i2);
                    c5363.m8987(objM89914);
                }
                AbstractC3925.m7030((InterfaceC5731) objM89914, c5363, c3985);
                c5363.m9009(false);
            } else {
                c5363 = c5362;
                c5363.m8957(239720653);
                c5363.m9009(false);
            }
        } else {
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5045(c3557, i, i5);
        }
    }

    /* JADX INFO: renamed from: ۦُ */
    public static final ViewParent m7476(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final void m7477(C3557 c3557, C5362 c5362, int i) {
        C5362 c5363;
        c5362.m8979(-123564262);
        new C4441(new long[]{-8366379772039965539L, -8869145265552857360L, 4928708825445493291L, -3704923783108674233L, -512049678911378519L, -3384200266967814895L, -3761743229256677971L, 8154607697896145849L, -8728792485682102510L, -1296292013167186533L, -4851588987604643205L}).toString();
        int i2 = (c5362.m8977(c3557) ? 4 : 2) | i;
        int i3 = 0;
        boolean z = true;
        if (c5362.m9011(i2 & 1, (i2 & 3) != 2)) {
            App app = App.f407;
            C1443 c1443 = AbstractC2776.m5217().f409;
            C1542 c1542 = AbstractC2539.f8454;
            Object obj = c1542.f5218;
            String str = c1542.f5219;
            boolean z2 = C1443.f4940;
            boolean zBooleanValue = ((Boolean) c1443.m3068(obj, str)).booleanValue();
            new C4441(new long[]{8313163267396857289L, -3146339349365122451L, 3128223388545780036L, -3432215070479331790L, -5679143449692362689L, -77569604731516382L}).toString();
            if ((i2 & 14) != 4 && !c5362.m8977(c3557)) {
                z = false;
            }
            Object objM8999 = c5362.m8999();
            if (z || objM8999 == C2850.f9517) {
                objM8999 = new C3553(c3557, i3);
                c5362.m8987(objM8999);
            }
            c5363 = c5362;
            AbstractC0949.m1925(R.string.settings_icon_title, R.string.settings_icon_summary, zBooleanValue, null, (InterfaceC4745) objM8999, c5363, 0);
        } else {
            c5363 = c5362;
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5045(c3557, i, i3);
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static final int m7478(long j, long j2) {
        boolean zM7491 = m7491(j);
        if (zM7491 != m7491(j2)) {
            return zM7491 ? -1 : 1;
        }
        int iSignum = (int) Math.signum(m7471(j) - m7471(j2));
        if (Math.min(m7471(j), m7471(j2)) >= 0.0f && m7488(j) != m7488(j2)) {
            return m7488(j) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static final InterfaceC4734 m7479(Object obj, InterfaceC4734... interfaceC4734Arr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (interfaceC4734Arr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC4734Arr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = InterfaceC4734.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC4734Arr, interfaceC4734Arr.length));
            if (objInvoke instanceof InterfaceC4734) {
                return (InterfaceC4734) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static void m7480(String str) {
        if (str.length() <= 0) {
            C1078.m2272("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                C1078.m2273(AbstractC4031.m7228("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static ColorStateList m7481(Context context, int i) {
        ColorStateList colorStateListM6977;
        ColorStateList colorStateList;
        C5345 c5345;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C5649 c5649 = new C5649(resources, theme);
        synchronized (AbstractC2365.f7830) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC2365.f7831.get(c5649);
                colorStateListM6977 = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c5345 = (C5345) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (c5345.f17602.equals(resources.getConfiguration())) {
                        if (theme != null || c5345.f17601 != 0) {
                            if (theme == null || c5345.f17601 != theme.hashCode()) {
                            }
                        }
                        colorStateList = c5345.f17603;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC2365.f7832;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM6977 = AbstractC3905.m6977(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListM6977 == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (AbstractC2365.f7830) {
            try {
                WeakHashMap weakHashMap = AbstractC2365.f7831;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(c5649);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(c5649, sparseArray2);
                }
                sparseArray2.append(i, new C5345(colorStateListM6977, c5649.f18603.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListM6977;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final void m7482(InterfaceC0705 interfaceC0705, InterfaceC4448 interfaceC4448, boolean z, InterfaceC2864 interfaceC2864, C2195 c2195, C0857 c0857, C5362 c5362, int i) {
        int i2;
        c5362.m8979(-1134296466);
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(interfaceC4448) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m9006(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c5362.m8963(interfaceC2864) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c5362.m8963(c2195) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c5362.m8963(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c5362.m8977(c0857) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (c5362.m9011(i3 & 1, (599187 & i3) != 599186)) {
            c5362.m8957(977045485);
            Object objM8999 = c5362.m8999();
            if (objM8999 == C2850.f9517) {
                objM8999 = new C2243();
                c5362.m8987(objM8999);
            }
            C2243 c2243 = (C2243) objM8999;
            c5362.m9009(false);
            C2779 c2779 = AbstractC4331.f14306;
            InterfaceC0705 interfaceC0705Mo1571 = interfaceC0705.mo1571(C0573.f2046);
            long jM9370 = AbstractC5568.m9370(40.0f, 40.0f);
            C4182 c4182 = AbstractC4410.f14521;
            InterfaceC0705 interfaceC0705Mo1572 = AbstractC0186.m434(AbstractC5568.m9382(AbstractC5537.m9269(AbstractC4410.m7712(interfaceC0705Mo1571, C1495.m3175(jM9370), C1495.m3176(jM9370)), interfaceC2864), z ? c2195.f7285 : c2195.f7283, interfaceC2864), c2243, AbstractC4670.m8032(0.0f, 7, 0L, false), z, new C2155(0), interfaceC4448, 8).mo1571(new C1591(new C3018(4)));
            InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4431, false);
            int iM1958 = AbstractC0949.m1958(c5362);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705Mo1572);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3228M2297);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            C3136 c3136 = C0849.f3053;
            if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM1958))) {
                AbstractC3761.m6618(iM1958, c5362, iM1958, c3136);
            }
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
            C4773.m8137(AbstractC0194.f721.mo4313(new C1327(z ? c2195.f7284 : c2195.f7286)), c0857, c5362, ((i3 >> 15) & 112) | 8);
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C1229(interfaceC0705, interfaceC4448, z, interfaceC2864, c2195, c0857, i);
        }
    }

    /* JADX INFO: renamed from: ۦٝ */
    public static void m7483(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                C0178.m387(AbstractC5078.m8673(i2, "at index ", new StringBuilder(String.valueOf(i2).length() + 9)));
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x0103  */
    /* JADX WARN: Code duplicated, block: B:58:0x0134  */
    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۦۗ */
    public static final void m7484(final int i, final int i2, final C1542 c1542, final ArrayList arrayList, final InterfaceC4745 interfaceC4745, InterfaceC1291 interfaceC1291, C5362 c5362, final int i3, final int i4) {
        InterfaceC1291 interfaceC1292;
        boolean z;
        final InterfaceC1291 interfaceC1293;
        C5863 c5863M8965;
        InterfaceC1291 interfaceC1291M9388;
        Object objM8999;
        C4036 c4036;
        InterfaceC4367 interfaceC4367;
        String str;
        Iterator it;
        Object next;
        Object objM89910;
        Object objM89911;
        Object objM89912;
        C5362 c5363 = c5362;
        c5363.m8979(1789291240);
        new C4441(new long[]{8363397643829097057L, 3573375746382904234L, 8885659483930428326L, 1346371081108104883L, 778269456123554474L, 2102861438339267532L, -7690906614560505392L, -5094493723189202614L, -8400545215083448860L, 2898147427521747812L, 3377935385545217423L, -2815299347811921232L, 6306664286824595611L, 4873564882518531775L, -5741880152864024705L, -9078652571510165452L, -7323186317251915069L, 71919743859448760L}).toString();
        int i5 = i3 | (c5363.m8988(i) ? 4 : 2) | (c5363.m8988(i2) ? 32 : 16) | (c5363.m8977(c1542) ? 256 : 128) | (c5363.m8963(arrayList) ? 2048 : 1024) | (c5363.m8977(interfaceC4745) ? 16384 : 8192);
        int i6 = i4 & 32;
        if (i6 == 0) {
            if ((i3 & 196608) == 0) {
                interfaceC1292 = interfaceC1291;
                i5 |= c5363.m8963(interfaceC1292) ? 131072 : 65536;
            }
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (c5363.m9011(i5 & 1, z)) {
                if (i6 != 0) {
                    interfaceC1291M9388 = AbstractC5568.m9388(5.0f, 15.0f, 0.0f, 8);
                } else {
                    interfaceC1291M9388 = interfaceC1292;
                }
                new C4441(new long[]{4003945968111735369L, -43438764569967834L, -5331792950856467012L, -7325005998765673738L, 951894627872957289L, 4973595907028939760L}).toString();
                objM8999 = c5363.m8999();
                c4036 = C2850.f9517;
                if (objM8999 == c4036) {
                    objM8999 = AbstractC2774.m5183(Boolean.FALSE);
                    c5363.m8987(objM8999);
                }
                interfaceC4367 = (InterfaceC4367) objM8999;
                App app = App.f407;
                C1443 c1443 = AbstractC2776.m5217().f410;
                Object obj = c1542.f5218;
                String str2 = c1542.f5219;
                boolean z2 = C1443.f4940;
                str = (String) c1443.m3068(obj, str2);
                it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((C0346) next).f1277.equals(str));
                int i7 = ((C0346) next).f1276;
                new C4441(new long[]{-2565598300362456463L, -5314539708472134458L, 4533605571774809407L, 8381093994845978369L, -7055285913011599843L, 6618737227100109013L}).toString();
                objM89910 = c5363.m8999();
                if (objM89910 == c4036) {
                    objM89910 = new C0681(interfaceC4367, 14);
                    c5363.m8987(objM89910);
                }
                AbstractC1434.m3045(i, i7, interfaceC1291M9388, (InterfaceC4448) objM89910, c5362, ((i5 >> 9) & 896) | (i5 & 14) | 3072, 0);
                InterfaceC1291 interfaceC1294 = interfaceC1291M9388;
                if (((Boolean) interfaceC4367.getValue()).booleanValue()) {
                    c5362.m8957(-63238430);
                    new C4441(new long[]{424492026173701793L, -1890585492053050818L, -204501108743389993L, 785739887606561497L, 5554224110641188055L, -3719844094371815478L, -3762539332368314593L, 7536517651891325094L}).toString();
                    new C4441(new long[]{5903727038921824730L, -591943528109528403L, 7637916435947245936L, 7292204185725939722L, 6273836918582052236L, 9064785706979987971L}).toString();
                    objM89911 = c5362.m8999();
                    if (objM89911 == c4036) {
                        objM89911 = AbstractC2774.m5183(str);
                        c5362.m8987(objM89911);
                    }
                    InterfaceC4367 interfaceC4368 = (InterfaceC4367) objM89911;
                    new C4441(new long[]{8681363236813732148L, 3615218646848237705L, -5278292836385345544L, 9120460794097458884L, 4467487299165060447L, 2485814081805222389L}).toString();
                    objM89912 = c5362.m8999();
                    if (objM89912 == c4036) {
                        objM89912 = new C0681(interfaceC4367, 15);
                        c5362.m8987(objM89912);
                    }
                    C0857 c0857M7034 = AbstractC3925.m7034(-234394634, new C2215(i2, arrayList, interfaceC4368, interfaceC4745, interfaceC4367, 1), c5362);
                    c5363 = c5362;
                    AbstractC0186.m425((InterfaceC4448) objM89912, null, c0857M7034, c5363, 390, 2);
                    c5363.m9009(false);
                } else {
                    c5363 = c5362;
                    c5363.m8957(-61770022);
                    c5363.m9009(false);
                }
                interfaceC1293 = interfaceC1294;
            } else {
                c5363.m8982();
                interfaceC1293 = interfaceC1292;
            }
            c5863M8965 = c5363.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦؙؚؚؔ
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        AbstractC4225.m7484(i, i2, c1542, arrayList, interfaceC4745, interfaceC1293, (C5362) obj2, AbstractC3831.m6835(i3 | 1), i4);
                        return C2358.f7817;
                    }
                };
            }
        }
        i5 |= 196608;
        interfaceC1292 = interfaceC1291;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (c5363.m9011(i5 & 1, z)) {
            if (i6 != 0) {
                interfaceC1291M9388 = AbstractC5568.m9388(5.0f, 15.0f, 0.0f, 8);
            } else {
                interfaceC1291M9388 = interfaceC1292;
            }
            new C4441(new long[]{4003945968111735369L, -43438764569967834L, -5331792950856467012L, -7325005998765673738L, 951894627872957289L, 4973595907028939760L}).toString();
            objM8999 = c5363.m8999();
            c4036 = C2850.f9517;
            if (objM8999 == c4036) {
                objM8999 = AbstractC2774.m5183(Boolean.FALSE);
                c5363.m8987(objM8999);
            }
            interfaceC4367 = (InterfaceC4367) objM8999;
            App app2 = App.f407;
            C1443 c1444 = AbstractC2776.m5217().f410;
            Object obj2 = c1542.f5218;
            String str3 = c1542.f5219;
            boolean z3 = C1443.f4940;
            str = (String) c1444.m3068(obj2, str3);
            it = arrayList.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C0346) next).f1277.equals(str));
            int i8 = ((C0346) next).f1276;
            new C4441(new long[]{-2565598300362456463L, -5314539708472134458L, 4533605571774809407L, 8381093994845978369L, -7055285913011599843L, 6618737227100109013L}).toString();
            objM89910 = c5363.m8999();
            if (objM89910 == c4036) {
                objM89910 = new C0681(interfaceC4367, 14);
                c5363.m8987(objM89910);
            }
            AbstractC1434.m3045(i, i8, interfaceC1291M9388, (InterfaceC4448) objM89910, c5362, ((i5 >> 9) & 896) | (i5 & 14) | 3072, 0);
            InterfaceC1291 interfaceC1295 = interfaceC1291M9388;
            if (((Boolean) interfaceC4367.getValue()).booleanValue()) {
                c5362.m8957(-63238430);
                new C4441(new long[]{424492026173701793L, -1890585492053050818L, -204501108743389993L, 785739887606561497L, 5554224110641188055L, -3719844094371815478L, -3762539332368314593L, 7536517651891325094L}).toString();
                new C4441(new long[]{5903727038921824730L, -591943528109528403L, 7637916435947245936L, 7292204185725939722L, 6273836918582052236L, 9064785706979987971L}).toString();
                objM89911 = c5362.m8999();
                if (objM89911 == c4036) {
                    objM89911 = AbstractC2774.m5183(str);
                    c5362.m8987(objM89911);
                }
                InterfaceC4367 interfaceC4369 = (InterfaceC4367) objM89911;
                new C4441(new long[]{8681363236813732148L, 3615218646848237705L, -5278292836385345544L, 9120460794097458884L, 4467487299165060447L, 2485814081805222389L}).toString();
                objM89912 = c5362.m8999();
                if (objM89912 == c4036) {
                    objM89912 = new C0681(interfaceC4367, 15);
                    c5362.m8987(objM89912);
                }
                C0857 c0857M7035 = AbstractC3925.m7034(-234394634, new C2215(i2, arrayList, interfaceC4369, interfaceC4745, interfaceC4367, 1), c5362);
                c5363 = c5362;
                AbstractC0186.m425((InterfaceC4448) objM89912, null, c0857M7035, c5363, 390, 2);
                c5363.m9009(false);
            } else {
                c5363 = c5362;
                c5363.m8957(-61770022);
                c5363.m9009(false);
            }
            interfaceC1293 = interfaceC1295;
        } else {
            c5363.m8982();
            interfaceC1293 = interfaceC1292;
        }
        c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦؙؚؚؔ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    AbstractC4225.m7484(i, i2, c1542, arrayList, interfaceC4745, interfaceC1293, (C5362) obj3, AbstractC3831.m6835(i3 | 1), i4);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final void m7485(C3557 c3557, C5362 c5362, int i) {
        C5362 c5363;
        c5362.m8979(-399333525);
        new C4441(new long[]{-3015264757473519029L, -2189504177678665918L, 1946907617144286467L, -2025532365856093626L, 3539263772903444212L, -7566800304484659472L, -7634263040734061509L, 4212109562943236193L, -2318347757953019793L, 6959433051490508454L, 3813675669163005624L}).toString();
        int i2 = 2;
        int i3 = 4;
        int i4 = (c5362.m8977(c3557) ? 4 : 2) | i;
        if (c5362.m9011(i4 & 1, (i4 & 3) != 2)) {
            App app = App.f407;
            C1443 c1443 = AbstractC2776.m5217().f410;
            C1542 c1542 = AbstractC2539.f8439;
            Object obj = c1542.f5218;
            String str = c1542.f5219;
            boolean z = C1443.f4940;
            boolean zBooleanValue = ((Boolean) c1443.m3068(obj, str)).booleanValue();
            new C4441(new long[]{-675792286949407720L, -6976598426959350237L, -4020656414483146896L, -8960461137258974811L, 9172489534404288284L, -3885433795785821176L}).toString();
            boolean z2 = (i4 & 14) == 4 || c5362.m8977(c3557);
            Object objM8999 = c5362.m8999();
            if (z2 || objM8999 == C2850.f9517) {
                objM8999 = new C3553(c3557, i2);
                c5362.m8987(objM8999);
            }
            c5363 = c5362;
            AbstractC0949.m1925(R.string.settings_dynamic_title, R.string.settings_dynamic_summary, zBooleanValue, null, (InterfaceC4745) objM8999, c5363, 0);
        } else {
            c5363 = c5362;
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5045(c3557, i, i3);
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static final void m7486(C3557 c3557, C5362 c5362, int i) {
        c5362.m8979(2078480518);
        new C4441(new long[]{4407538178418904505L, 9128777926004399590L, 2250218481542922552L, 2792477323917379830L, -4790439230213047807L, -1073390966817395676L, 6273896218596254088L, -8933808457111958278L, -5633343200886760510L, -1495065500493608482L}).toString();
        int i2 = (c5362.m8977(c3557) ? 4 : 2) | i;
        int i3 = 0;
        if (c5362.m9011(i2 & 1, (i2 & 3) != 2)) {
            C1542 c1542 = AbstractC2539.f8442;
            C4681 c4681 = EnumC2883.f9616;
            ArrayList arrayList = new ArrayList(AbstractC5573.m9402(c4681, 10));
            C0084 c0084 = new C0084(i3, c4681);
            while (c0084.hasNext()) {
                EnumC2883 enumC2883 = (EnumC2883) c0084.next();
                arrayList.add(new C0346(enumC2883.f9617, 0, enumC2883.f9618));
            }
            new C4441(new long[]{-5340732641837715582L, 6996219794494749661L, -7235760947740803592L, -8710110502610924680L, -3444921088034104554L, -5417035210937455336L}).toString();
            i3 = ((i2 & 14) == 4 || c5362.m8977(c3557)) ? 1 : 0;
            Object objM8999 = c5362.m8999();
            if (i3 != 0 || objM8999 == C2850.f9517) {
                objM8999 = new C0037(1, c3557, C3557.class, new C4441(new long[]{8028032945049642923L, -7347753031561932489L, 7645671228764376736L, -1577011687408750791L}).toString(), new C4441(new long[]{2399741964619726119L, -8185600269565753478L, 1126706200357686543L, -8682544698490045373L, -5557304192493728851L, 7829378478865019236L, -3417194469663200640L, -6020645988230711409L, -6355816763816930901L, 5181966770827231378L, -4204992662985403499L, 5908310786072124585L}).toString(), 0, 20);
                c5362.m8987(objM8999);
            }
            m7484(R.string.settings_env_title, R.string.settings_env_dialog, c1542, arrayList, (InterfaceC4745) ((C2818) objM8999), null, c5362, 0, 32);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5045(c3557, i, 5);
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static int m7487(Context context, String str) {
        if (str == null) {
            C0178.m387("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new C0190(context).f705.areNotificationsEnabled() ? 0 : -1;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static final boolean m7488(long j) {
        return (j & 2) != 0;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static final void m7489(C3557 c3557, C5362 c5362, int i) {
        C3557 c3558 = c3557;
        c5362.m8979(-1973379174);
        new C4441(new long[]{-1505506881647053392L, 3454831479963493473L, 4205504080958517962L, -8445995496046467909L, 7378307746681897115L, 250807298466870970L, -7546693714773039710L, 131444562483886544L, -4602341936386840462L, 1128362314506346610L, -5147836634567227467L}).toString();
        int i2 = (c5362.m8977(c3558) ? 4 : 2) | i;
        int i3 = 0;
        int i4 = 3;
        if (c5362.m9011(i2 & 1, (i2 & 3) != 2)) {
            C1542 c1542 = AbstractC2539.f8448;
            C4681 c4681 = EnumC4375.f14415;
            ArrayList arrayList = new ArrayList(AbstractC5573.m9402(c4681, 10));
            C0084 c0084 = new C0084(i3, c4681);
            while (c0084.hasNext()) {
                EnumC4375 enumC4375 = (EnumC4375) c0084.next();
                arrayList.add(new C0346(enumC4375.f14418, enumC4375.f14417, enumC4375.f14419));
            }
            new C4441(new long[]{8952497869505019206L, 3276879525264400620L, -4244149481794316134L, -6143998179980763251L, 4355141905390152871L, 8481165077090259186L}).toString();
            boolean z = (i2 & 14) == 4 || c5362.m8977(c3558);
            Object objM8999 = c5362.m8999();
            if (z || objM8999 == C2850.f9517) {
                objM8999 = new C0037(1, c3558, C3557.class, new C4441(new long[]{4998771438434177342L, -1061548131957902916L, 3722226324329583881L}).toString(), new C4441(new long[]{-8358991672597037219L, 7124964880438127792L, 5052893160862025267L, 5004666954934714300L, 2745324684163943559L, 6836783979730042819L, 3747944673188978346L, 7909603163439277060L, 4585468721426608048L, 2831383627342656391L, -993555009307321185L}).toString(), 0, 21);
                c5362.m8987(objM8999);
            }
            m7484(R.string.settings_theme_title, R.string.settings_theme_dialog, c1542, arrayList, (InterfaceC4745) ((C2818) objM8999), AbstractC5568.m9388(0.0f, 15.0f, 0.0f, 10), c5362, 196608, 0);
        } else {
            c3558 = c3558;
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5045(c3558, i, i4);
        }
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public static C2147 m7490(C2147 c2147) {
        if ((c2147 != null ? c2147.f7039 : null) == null) {
            return c2147;
        }
        C1033 c1033M4176 = c2147.m4176();
        c1033M4176.f3652 = null;
        return c1033M4176.m2239();
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static final boolean m7491(long j) {
        return (j & 1) != 0;
    }

    /* JADX INFO: renamed from: ۦۧ */
    public static final void m7492(C3262 c3262, Object obj) {
        boolean zM6502;
        long[] jArr = c3262.f10948;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = c3262.f10947[i4];
                        Object obj3 = c3262.f10944[i4];
                        if (obj3 instanceof C3639) {
                            C3639 c3639 = (C3639) obj3;
                            c3639.m6497(obj);
                            zM6502 = c3639.m6502();
                        } else {
                            zM6502 = obj3 == obj;
                        }
                        if (zM6502) {
                            c3262.m6022(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static final void m7493(InterfaceC1291 interfaceC1291, C3557 c3557, C5362 c5362, int i) {
        int i2;
        c5362.m8979(-1531505513);
        new C4441(new long[]{-2753126287213787398L, -3206426782186214125L, -4399456766068781681L, -869520556372510868L, 8452569568595361329L, -2622342308856414653L, 8448989458529644309L, -9083765981898205639L, 1591456904975575456L, 6094510714766687170L, -5294979758912769295L, -3417044107683127987L, 7413654386395618986L}).toString();
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(interfaceC1291) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            c5362.m8971();
            int i3 = 3;
            new C4441(new long[]{2985936632424806144L, 8931397925352987173L, -9067999832995280437L}).toString();
            if ((i & 1) == 0 || c5362.m8969()) {
                new C4441(new long[]{1706250238400671606L, -6407617419006760488L, -5009222228839451554L, -6247874900866651386L, -3948698541818849339L, -9139972263300603101L, -9094688835986588136L, 8161128394787367181L, 2045432232565612112L, 4496707613312990043L, -2468740180581308323L, 1952227702856915846L, 4432084970959054112L, -1351770774258550998L, -8376273970853184565L, -8522727068965118060L}).toString();
                InterfaceC4680 interfaceC4680M4043 = AbstractC2095.m4043(c5362);
                if (interfaceC4680M4043 == null) {
                    throw new IllegalStateException(new C4441(new long[]{2586203086321707461L, 6107165558010268204L, 4879171403043127885L, 5378838179571399898L, -275207920167347774L, 8410533237367109010L, -1273464427739271049L, 8936202899041314876L, 7348401137662002197L}).toString().toString());
                }
                c3557 = (C3557) C5063.m8631(AbstractC5041.m8557(C3557.class), interfaceC4680M4043.mo651(), AbstractC1434.m3036(interfaceC4680M4043), AbstractC3804.m6801(c5362));
            } else {
                c5362.m8982();
            }
            int i4 = i2 & (-113);
            c5362.m8964();
            new C4441(new long[]{1129486086484294915L, -1179998542342124284L, 5768113683243210062L, 8868965330883188670L, 1573005734206589187L, 1380480077804284804L}).toString();
            boolean zM8977 = c5362.m8977(c3557);
            Object objM8999 = c5362.m8999();
            if (zM8977 || objM8999 == C2850.f9517) {
                objM8999 = new C3553(c3557, i3);
                c5362.m8987(objM8999);
            }
            AbstractC4554.m7915((i4 << 6) & 896, 507, null, null, null, null, (InterfaceC4745) objM8999, c5362, null, null, interfaceC1291, false);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0016(i, 8, interfaceC1291, c3557);
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public abstract void mo2237(C5054 c5054, float f, float f2);
}
