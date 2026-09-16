package p000;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: renamed from: ۥًِؔۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0835 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f2976;

    /* JADX INFO: renamed from: ۥُ */
    public Object f2977;

    /* JADX INFO: renamed from: ۥۗ */
    public int f2978;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f2979 = 1;

    /* JADX INFO: renamed from: ۦؑ */
    public Object f2980;

    public C0835(CharSequence charSequence, int i, Locale locale) {
        this.f2980 = charSequence;
        if (charSequence.length() < 0) {
            AbstractC3767.m6644("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            AbstractC3767.m6644("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f2977 = wordInstance;
        this.f2978 = Math.max(0, -50);
        this.f2976 = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new C2496(i, charSequence));
    }

    public String toString() {
        switch (this.f2979) {
            case 1:
                C4902 c4902 = (C4902) this.f2977;
                String str = (String) this.f2980;
                if (c4902 == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.f2978);
                sb.append((char[]) c4902.f16167, 0, c4902.f16166);
                char[] cArr = (char[]) c4902.f16167;
                int i = c4902.f16170;
                sb.append(cArr, i, c4902.f16168 - i);
                String str2 = (String) this.f2980;
                sb.append((CharSequence) str2, this.f2976, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public int m1730() {
        C4902 c4902 = (C4902) this.f2977;
        String str = (String) this.f2980;
        if (c4902 == null) {
            return str.length();
        }
        return (c4902.f16168 - c4902.m8245()) + (str.length() - (this.f2976 - this.f2978));
    }

    /* JADX INFO: renamed from: ۥُ */
    public boolean m1731(int i) {
        int i2 = this.f2978 + 1;
        if (i > this.f2976 || i2 > i) {
            return false;
        }
        return AbstractC0487.m1083(Character.codePointBefore((CharSequence) this.f2980, i));
    }

    /* JADX INFO: renamed from: ۥّ */
    public boolean m1732(int i) {
        m1733(i);
        if (!((BreakIterator) this.f2977).isBoundary(i)) {
            return false;
        }
        if (m1734(i) && m1734(i - 1) && m1734(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.f2980).length() - 1 || !(m1742(i) || m1742(i + 1));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m1733(int i) {
        int i2 = this.f2978;
        int i3 = this.f2976;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC3767.m6644("Invalid offset: " + i + ". Valid range is [" + i2 + " , " + i3 + ']');
    }

    /* JADX INFO: renamed from: ۥۜ */
    public boolean m1734(int i) {
        CharSequence charSequence = (CharSequence) this.f2980;
        int i2 = this.f2978;
        if (i >= this.f2976 || i2 > i) {
            return false;
        }
        return Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) || Character.isSurrogate(charSequence.charAt(i));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m1735(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC4026(this, i));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public boolean m1736(int i) {
        CharSequence charSequence = (CharSequence) this.f2980;
        int i2 = this.f2978 + 1;
        if (i > this.f2976 || i2 > i) {
            return false;
        }
        return Character.isLetterOrDigit(Character.codePointBefore(charSequence, i)) || Character.isSurrogate(charSequence.charAt(i - 1));
    }

    /* JADX INFO: renamed from: ۦؚ */
    public int m1737(int i) {
        m1733(i);
        int iPreceding = ((BreakIterator) this.f2977).preceding(i);
        return (m1734(iPreceding) && m1736(iPreceding) && !m1742(iPreceding)) ? m1737(iPreceding) : iPreceding;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public void m1738(int i, int i2, String str) {
        if (i > i2) {
            AbstractC3767.m6644("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            AbstractC3767.m6644("start must be non-negative, but was " + i);
        }
        C4902 c4902 = (C4902) this.f2977;
        int i3 = 2;
        if (c4902 == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.f2980).length() - i2, 64);
            int i4 = i - iMin;
            ((String) this.f2980).getChars(i4, i, cArr, 0);
            int i5 = iMax - iMin2;
            int i6 = iMin2 + i2;
            ((String) this.f2980).getChars(i2, i6, cArr, i5);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            C4902 c4903 = new C4902(i3);
            c4903.f16168 = iMax;
            c4903.f16167 = cArr;
            c4903.f16166 = length;
            c4903.f16170 = i5;
            this.f2977 = c4903;
            this.f2978 = i4;
            this.f2976 = i6;
            return;
        }
        int i7 = this.f2978;
        int i8 = i - i7;
        int i9 = i2 - i7;
        if (i8 < 0 || i9 > c4902.f16168 - c4902.m8245()) {
            this.f2980 = toString();
            this.f2977 = null;
            this.f2978 = -1;
            this.f2976 = -1;
            m1738(i, i2, str);
            return;
        }
        int length2 = str.length() - (i9 - i8);
        if (length2 > c4902.m8245()) {
            int iM8245 = length2 - c4902.m8245();
            int i10 = c4902.f16168 * 2;
            while (i10 - c4902.f16168 < iM8245) {
                i10 *= 2;
            }
            char[] cArr2 = new char[i10];
            System.arraycopy((char[]) c4902.f16167, 0, cArr2, 0, c4902.f16166);
            int i11 = c4902.f16168;
            int i12 = c4902.f16170;
            int i13 = i11 - i12;
            int i14 = i10 - i13;
            System.arraycopy((char[]) c4902.f16167, i12, cArr2, i14, (i13 + i12) - i12);
            c4902.f16167 = cArr2;
            c4902.f16168 = i10;
            c4902.f16170 = i14;
        }
        int i15 = c4902.f16166;
        if (i8 < i15 && i9 <= i15) {
            int i16 = i15 - i9;
            char[] cArr3 = (char[]) c4902.f16167;
            System.arraycopy(cArr3, i9, cArr3, c4902.f16170 - i16, i16);
            c4902.f16166 = i8;
            c4902.f16170 -= i16;
        } else if (i8 >= i15 || i9 < i15) {
            int iM8246 = c4902.m8245() + i8;
            int iM8247 = c4902.m8245() + i9;
            int i17 = c4902.f16170;
            int i18 = iM8246 - i17;
            char[] cArr4 = (char[]) c4902.f16167;
            System.arraycopy(cArr4, i17, cArr4, c4902.f16166, i18);
            i8 = c4902.f16166 + i18;
            c4902.f16166 = i8;
            c4902.f16170 = iM8247;
        } else {
            c4902.f16170 = c4902.m8245() + i9;
            c4902.f16166 = i8;
        }
        str.getChars(0, str.length(), (char[]) c4902.f16167, i8);
        c4902.f16166 = str.length() + c4902.f16166;
    }

    /* JADX INFO: renamed from: ۦِ */
    public int m1739(int i) {
        m1733(i);
        int iFollowing = ((BreakIterator) this.f2977).following(i);
        return (m1734(iFollowing + (-1)) && m1734(iFollowing) && !m1742(iFollowing)) ? m1739(iFollowing) : iFollowing;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public boolean m1740(int i) {
        int i2 = this.f2978;
        if (i >= this.f2976 || i2 > i) {
            return false;
        }
        return AbstractC0487.m1083(Character.codePointAt((CharSequence) this.f2980, i));
    }

    /* JADX INFO: renamed from: ۦۗ */
    public void m1741(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f2978) != -1) {
            typeface = AbstractC1157.m2415(typeface, i, (this.f2976 & 2) != 0);
        }
        C5350 c5350 = (C5350) this.f2977;
        WeakReference weakReference = (WeakReference) this.f2980;
        if (c5350.f17613) {
            c5350.f17612 = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = c5350.f17614;
                if (zIsAttachedToWindow) {
                    textView.post(new RunnableC3938(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public boolean m1742(int i) {
        CharSequence charSequence = (CharSequence) this.f2980;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC3831.m6874(unicodeBlockOf, unicodeBlock) && AbstractC3831.m6874(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC3831.m6874(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && AbstractC3831.m6874(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public /* synthetic */ C0835() {
    }

    public C0835(C5350 c5350, int i, int i2, WeakReference weakReference) {
        this.f2977 = c5350;
        this.f2978 = i;
        this.f2976 = i2;
        this.f2980 = weakReference;
    }
}
