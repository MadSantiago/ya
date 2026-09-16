package p000;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۦٍٙؖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC4504 implements InputConnection {

    /* JADX INFO: renamed from: ۥؗ */
    public final C5837 f14887;

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC2509 f14888;

    /* JADX INFO: renamed from: ۥّ */
    public int f14889;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f14890;

    /* JADX INFO: renamed from: ۥۜ */
    public int f14891;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5086 f14892;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3635 f14893;

    /* JADX INFO: renamed from: ۦٛ */
    public boolean f14895;

    /* JADX INFO: renamed from: ۦۙ */
    public C5745 f14897;

    /* JADX INFO: renamed from: ۦِ */
    public final ArrayList f14894 = new ArrayList();

    /* JADX INFO: renamed from: ۦۗ */
    public boolean f14896 = true;

    public InputConnectionC4504(C5745 c5745, C5086 c5086, boolean z, C5837 c5837, C3635 c3635, InterfaceC2509 interfaceC2509) {
        this.f14892 = c5086;
        this.f14890 = z;
        this.f14887 = c5837;
        this.f14893 = c3635;
        this.f14888 = interfaceC2509;
        this.f14897 = c5745;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f14896;
        if (!z) {
            return z;
        }
        this.f14889++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f14896;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f14894.clear();
        this.f14889 = 0;
        this.f14896 = false;
        ArrayList arrayList = ((C2734) this.f14892.f16877).f9057;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC3831.m6874(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f14896;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.f14896;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f14896;
        return z ? this.f14890 : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f14896;
        if (z) {
            m7834(new C1472(i, String.valueOf(charSequence)));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f14896;
        if (!z) {
            return z;
        }
        m7834(new C0351(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f14896;
        if (!z) {
            return z;
        }
        m7834(new C3994(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m7833();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f14896;
        if (!z) {
            return z;
        }
        m7834(new C4826());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C5745 c5745 = this.f14897;
        return TextUtils.getCapsMode(c5745.f18944.f4307, C3346.m6109(c5745.f18943), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f14895 = z;
        if (z) {
            this.f14891 = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC2164.m4214(this.f14897);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C3346.m6107(this.f14897.f18943)) {
            return null;
        }
        return C4773.m8119(this.f14897).f4307;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return C4773.m8117(this.f14897, i).f4307;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return C4773.m8136(this.f14897, i).f4307;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f14896;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    m7834(new C2890(0, this.f14897.f18944.f4307.length()));
                    break;
                case R.id.cut:
                    m7832(277);
                    return false;
                case R.id.copy:
                    m7832(278);
                    return false;
                case R.id.paste:
                    m7832(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.f14896;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        i2 = 2;
                        break;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        i2 = 3;
                        break;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        i2 = 4;
                        break;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        i2 = 6;
                        break;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        i2 = 7;
                        break;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((C2734) this.f14892.f16877).f9054.mo211(new C0221(i2));
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0267  */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, final IntConsumer intConsumer) {
        C1249 c1249;
        long jM4333;
        byte b;
        int i;
        int i2;
        String string;
        int i3;
        C2449 c2449M9648;
        C2449 c2449M9649;
        C2537 c2537;
        if (Build.VERSION.SDK_INT >= 34) {
            C0091 c0091 = new C0091(29, this);
            C5837 c5837 = this.f14887;
            final int iM6851 = 3;
            if (c5837 != null && (c1249 = c5837.f19237) != null) {
                C2449 c2449M96410 = c5837.m9648();
                if (c1249.equals((c2449M96410 == null || (c2537 = c2449M96410.f8158.f12697) == null) ? null : c2537.f8430)) {
                    boolean zM3683 = AbstractC1855.m3683(handwritingGesture);
                    int i4 = 1;
                    C3635 c3635 = this.f14893;
                    if (zM3683) {
                        SelectGesture selectGestureM2364 = AbstractC1129.m2364(handwritingGesture);
                        long jM5243 = AbstractC2776.m5243(c5837, AbstractC4225.m7467(selectGestureM2364.getSelectionArea()), selectGestureM2364.getGranularity() == 1 ? 1 : 0);
                        if (C3346.m6107(jM5243)) {
                            iM6851 = AbstractC3831.m6851(AbstractC1129.m2383(selectGestureM2364), c0091);
                        } else {
                            c0091.mo211(new C2890((int) (jM5243 >> 32), (int) (jM5243 & 4294967295L)));
                            if (c3635 != null) {
                                c3635.m6471(true);
                            }
                            iM6851 = 1;
                        }
                    } else if (AbstractC1129.m2372(handwritingGesture)) {
                        DeleteGesture deleteGestureM2374 = AbstractC1129.m2374(handwritingGesture);
                        int i5 = deleteGestureM2374.getGranularity() != 1 ? 0 : 1;
                        long jM5244 = AbstractC2776.m5243(c5837, AbstractC4225.m7467(deleteGestureM2374.getDeletionArea()), i5);
                        if (C3346.m6107(jM5244)) {
                            iM6851 = AbstractC3831.m6851(AbstractC1129.m2383(deleteGestureM2374), c0091);
                        } else {
                            AbstractC3831.m6834(jM5244, c1249, i5 == 1, c0091);
                            iM6851 = 1;
                        }
                    } else if (AbstractC1129.m2360(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureM2365 = AbstractC1129.m2365(handwritingGesture);
                        long jM5220 = AbstractC2776.m5220(c5837, AbstractC4225.m7467(selectRangeGestureM2365.getSelectionStartArea()), AbstractC4225.m7467(selectRangeGestureM2365.getSelectionEndArea()), selectRangeGestureM2365.getGranularity() == 1 ? 1 : 0);
                        if (C3346.m6107(jM5220)) {
                            iM6851 = AbstractC3831.m6851(AbstractC1129.m2383(selectRangeGestureM2365), c0091);
                        } else {
                            c0091.mo211(new C2890((int) (jM5220 >> 32), (int) (jM5220 & 4294967295L)));
                            if (c3635 != null) {
                                c3635.m6471(true);
                            }
                            iM6851 = 1;
                        }
                    } else if (AbstractC1129.m2379(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureM2375 = AbstractC1129.m2375(handwritingGesture);
                        int i6 = deleteRangeGestureM2375.getGranularity() != 1 ? 0 : 1;
                        long jM5221 = AbstractC2776.m5220(c5837, AbstractC4225.m7467(deleteRangeGestureM2375.getDeletionStartArea()), AbstractC4225.m7467(deleteRangeGestureM2375.getDeletionEndArea()), i6);
                        if (C3346.m6107(jM5221)) {
                            iM6851 = AbstractC3831.m6851(AbstractC1129.m2383(deleteRangeGestureM2375), c0091);
                        } else {
                            AbstractC3831.m6834(jM5221, c1249, i6 == 1, c0091);
                            iM6851 = 1;
                        }
                    } else {
                        boolean zM2357 = AbstractC1129.m2357(handwritingGesture);
                        InterfaceC2509 interfaceC2509 = this.f14888;
                        int i7 = -1;
                        if (zM2357) {
                            JoinOrSplitGesture joinOrSplitGestureM2386 = AbstractC1129.m2386(handwritingGesture);
                            if (interfaceC2509 == null) {
                                iM6851 = AbstractC3831.m6851(AbstractC1129.m2358(joinOrSplitGestureM2386), c0091);
                            } else {
                                int iM5249 = AbstractC2776.m5249(c5837, AbstractC2776.m5233(joinOrSplitGestureM2386.getJoinOrSplitPoint()), interfaceC2509);
                                if (iM5249 == -1 || ((c2449M9649 = c5837.m9648()) != null && AbstractC2776.m5214(c2449M9649.f8158, iM5249))) {
                                    iM6851 = AbstractC3831.m6851(AbstractC1129.m2383(joinOrSplitGestureM2386), c0091);
                                } else {
                                    int iCharCount = iM5249;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = Character.codePointBefore(c1249, iCharCount);
                                        if (!AbstractC2776.m5238(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iM5249 < c1249.f4307.length()) {
                                        int iCodePointAt = Character.codePointAt(c1249, iM5249);
                                        if (!AbstractC2776.m5238(iCodePointAt)) {
                                            break;
                                        } else {
                                            iM5249 += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jM5145 = AbstractC2765.m5145(iCharCount, iM5249);
                                    if (C3346.m6107(jM5145)) {
                                        int i8 = (int) (jM5145 >> 32);
                                        c0091.mo211(new C2143(new InterfaceC1400[]{new C2890(i8, i8), new C1472(1, " ")}));
                                    } else {
                                        AbstractC3831.m6834(jM5145, c1249, false, c0091);
                                    }
                                    iM6851 = 1;
                                }
                            }
                        } else if (AbstractC1855.m3687(handwritingGesture)) {
                            InsertGesture insertGestureM3695 = AbstractC1855.m3695(handwritingGesture);
                            if (interfaceC2509 == null) {
                                iM6851 = AbstractC3831.m6851(AbstractC1129.m2358(insertGestureM3695), c0091);
                            } else {
                                int iM52410 = AbstractC2776.m5249(c5837, AbstractC2776.m5233(insertGestureM3695.getInsertionPoint()), interfaceC2509);
                                if (iM52410 == -1 || ((c2449M9648 = c5837.m9648()) != null && AbstractC2776.m5214(c2449M9648.f8158, iM52410))) {
                                    iM6851 = AbstractC3831.m6851(AbstractC1129.m2383(insertGestureM3695), c0091);
                                } else {
                                    c0091.mo211(new C2143(new InterfaceC1400[]{new C2890(iM52410, iM52410), new C1472(1, insertGestureM3695.getTextToInsert())}));
                                    iM6851 = 1;
                                }
                            }
                        } else if (AbstractC1129.m2368(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureM2385 = AbstractC1129.m2385(handwritingGesture);
                            C2449 c2449M96411 = c5837.m9648();
                            C3828 c3828 = c2449M96411 != null ? c2449M96411.f8158 : null;
                            long jM5233 = AbstractC2776.m5233(removeSpaceGestureM2385.getStartPoint());
                            long jM5234 = AbstractC2776.m5233(removeSpaceGestureM2385.getEndPoint());
                            InterfaceC2015 interfaceC2015M9643 = c5837.m9643();
                            if (c3828 != null) {
                                C2276 c2276 = c3828.f12696;
                                if (interfaceC2015M9643 == null) {
                                    jM4333 = C3346.f11196;
                                } else {
                                    long jMo2782 = interfaceC2015M9643.mo2782(jM5233);
                                    long jMo2783 = interfaceC2015M9643.mo2782(jM5234);
                                    int iM5244 = AbstractC2776.m5244(c2276, jMo2782, interfaceC2509);
                                    int iM5245 = AbstractC2776.m5244(c2276, jMo2783, interfaceC2509);
                                    if (iM5244 != -1) {
                                        if (iM5245 != -1) {
                                            iM5244 = Math.min(iM5244, iM5245);
                                        }
                                        iM5245 = iM5244;
                                    } else if (iM5245 == -1) {
                                        jM4333 = C3346.f11196;
                                    }
                                    float fM4332 = (c2276.m4332(iM5245) + c2276.m4331(iM5245)) / 2.0f;
                                    int i9 = (int) (jMo2782 >> 32);
                                    int i10 = (int) (jMo2783 >> 32);
                                    jM4333 = c2276.m4333(new C2793(Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), fM4332 - 0.1f, Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), fM4332 + 0.1f), 0, C1298.f4459);
                                }
                            } else {
                                jM4333 = C3346.f11196;
                            }
                            if (C3346.m6107(jM4333)) {
                                iM6851 = AbstractC3831.m6851(AbstractC1129.m2383(removeSpaceGestureM2385), c0091);
                            } else {
                                String str = c1249.subSequence(C3346.m6109(jM4333), C3346.m6108(jM4333)).f4307;
                                Matcher matcher = Pattern.compile("\\s+").matcher(str);
                                C3369 c3369 = !matcher.find(0) ? null : new C3369(10, matcher, str);
                                if (c3369 == null) {
                                    string = str.toString();
                                    b = 0;
                                    i3 = -1;
                                    i2 = -1;
                                    i = -1;
                                } else {
                                    int length = str.length();
                                    StringBuilder sb = new StringBuilder(length);
                                    int i11 = 0;
                                    b = 0;
                                    i = -1;
                                    while (true) {
                                        sb.append((CharSequence) str, i11, c3369.m6141().f6006);
                                        if (i == i7) {
                                            i = c3369.m6141().f6006;
                                        }
                                        i2 = c3369.m6141().f6005 + i4;
                                        sb.append((CharSequence) "");
                                        i11 = c3369.m6141().f6005 + i4;
                                        String str2 = (String) c3369.f11254;
                                        Matcher matcher2 = (Matcher) c3369.f11255;
                                        int iEnd = matcher2.end() + (matcher2.end() == matcher2.start() ? 1 : 0);
                                        if (iEnd <= str2.length()) {
                                            Matcher matcher3 = matcher2.pattern().matcher(str2);
                                            c3369 = !matcher3.find(iEnd) ? null : new C3369(10, matcher3, str2);
                                        } else {
                                            c3369 = null;
                                        }
                                        if (i11 >= length || c3369 == null) {
                                            break;
                                        }
                                        i7 = -1;
                                        i4 = 1;
                                    }
                                    if (i11 < length) {
                                        sb.append((CharSequence) str, i11, length);
                                    }
                                    string = sb.toString();
                                    i3 = -1;
                                }
                                if (i == i3 || i2 == i3) {
                                    iM6851 = AbstractC3831.m6851(AbstractC1129.m2383(removeSpaceGestureM2385), c0091);
                                } else {
                                    int i12 = (int) (jM4333 >> 32);
                                    String strSubstring = string.substring(i, string.length() - (C3346.m6113(jM4333) - i2));
                                    C2890 c2890 = new C2890(i12 + i, i12 + i2);
                                    iM6851 = 1;
                                    C1472 c1472 = new C1472(1, strSubstring);
                                    InterfaceC1400[] interfaceC1400Arr = new InterfaceC1400[2];
                                    interfaceC1400Arr[b] = c2890;
                                    interfaceC1400Arr[1] = c1472;
                                    c0091.mo211(new C2143(interfaceC1400Arr));
                                }
                            }
                        } else {
                            iM6851 = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: ۥُؐؗؕ
                    @Override // java.lang.Runnable
                    public final void run() {
                        intConsumer.accept(iM6851);
                    }
                });
            } else {
                intConsumer.accept(iM6851);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f14896;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        C5837 c5837;
        C1249 c1249;
        C2537 c2537;
        if (Build.VERSION.SDK_INT >= 34 && (c5837 = this.f14887) != null && (c1249 = c5837.f19237) != null) {
            C2449 c2449M9648 = c5837.m9648();
            if (c1249.equals((c2449M9648 == null || (c2537 = c2449M9648.f8158.f12697) == null) ? null : c2537.f8430)) {
                boolean zM3683 = AbstractC1855.m3683(previewableHandwritingGesture);
                int i = 1;
                EnumC1546 enumC1546 = EnumC1546.f5232;
                C3635 c3635 = this.f14893;
                if (zM3683) {
                    SelectGesture selectGestureM2364 = AbstractC1129.m2364(previewableHandwritingGesture);
                    if (c3635 != null) {
                        long jM5243 = AbstractC2776.m5243(c5837, AbstractC4225.m7467(selectGestureM2364.getSelectionArea()), selectGestureM2364.getGranularity() != 1 ? 0 : 1);
                        C5837 c5838 = c3635.f12150;
                        if (c5838 != null) {
                            c5838.m9645(jM5243);
                        }
                        C5837 c5839 = c3635.f12150;
                        if (c5839 != null) {
                            c5839.m9644(C3346.f11196);
                        }
                        if (!C3346.m6107(jM5243)) {
                            c3635.m6482(false);
                            c3635.m6474(enumC1546);
                        }
                    }
                } else if (AbstractC1129.m2372(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureM2374 = AbstractC1129.m2374(previewableHandwritingGesture);
                    if (c3635 != null) {
                        long jM5244 = AbstractC2776.m5243(c5837, AbstractC4225.m7467(deleteGestureM2374.getDeletionArea()), deleteGestureM2374.getGranularity() != 1 ? 0 : 1);
                        C5837 c58310 = c3635.f12150;
                        if (c58310 != null) {
                            c58310.m9644(jM5244);
                        }
                        C5837 c58311 = c3635.f12150;
                        if (c58311 != null) {
                            c58311.m9645(C3346.f11196);
                        }
                        if (!C3346.m6107(jM5244)) {
                            c3635.m6482(false);
                            c3635.m6474(enumC1546);
                        }
                    }
                } else if (AbstractC1129.m2360(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureM2365 = AbstractC1129.m2365(previewableHandwritingGesture);
                    if (c3635 != null) {
                        long jM5220 = AbstractC2776.m5220(c5837, AbstractC4225.m7467(selectRangeGestureM2365.getSelectionStartArea()), AbstractC4225.m7467(selectRangeGestureM2365.getSelectionEndArea()), selectRangeGestureM2365.getGranularity() != 1 ? 0 : 1);
                        C5837 c58312 = c3635.f12150;
                        if (c58312 != null) {
                            c58312.m9645(jM5220);
                        }
                        C5837 c58313 = c3635.f12150;
                        if (c58313 != null) {
                            c58313.m9644(C3346.f11196);
                        }
                        if (!C3346.m6107(jM5220)) {
                            c3635.m6482(false);
                            c3635.m6474(enumC1546);
                        }
                    }
                } else if (AbstractC1129.m2379(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureM2375 = AbstractC1129.m2375(previewableHandwritingGesture);
                    if (c3635 != null) {
                        long jM5221 = AbstractC2776.m5220(c5837, AbstractC4225.m7467(deleteRangeGestureM2375.getDeletionStartArea()), AbstractC4225.m7467(deleteRangeGestureM2375.getDeletionEndArea()), deleteRangeGestureM2375.getGranularity() != 1 ? 0 : 1);
                        C5837 c58314 = c3635.f12150;
                        if (c58314 != null) {
                            c58314.m9644(jM5221);
                        }
                        C5837 c58315 = c3635.f12150;
                        if (c58315 != null) {
                            c58315.m9645(C3346.f11196);
                        }
                        if (!C3346.m6107(jM5221)) {
                            c3635.m6482(false);
                            c3635.m6474(enumC1546);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new C1951(i, c3635));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C5723 c5723;
        boolean z4 = this.f14896;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z5 = true;
                } else {
                    z = z5;
                    z5 = true;
                }
                z2 = z5;
            }
            c5723 = ((C2734) this.f14892.f16877).f9056;
            synchronized (c5723.f18834) {
                try {
                    c5723.f18836 = z2;
                    c5723.f18847 = z3;
                    c5723.f18839 = z5;
                    c5723.f18845 = z;
                    if (z6) {
                        c5723.f18835 = true;
                        if (c5723.f18844 != null) {
                            c5723.m9536();
                        }
                    }
                    c5723.f18841 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        c5723 = ((C2734) this.f14892.f16877).f9056;
        synchronized (c5723.f18834) {
            c5723.f18836 = z2;
            c5723.f18847 = z3;
            c5723.f18839 = z5;
            c5723.f18845 = z;
            if (z6) {
                c5723.f18835 = true;
                if (c5723.f18844 != null) {
                    c5723.m9536();
                }
            }
            c5723.f18841 = z7;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f14896;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C2734) this.f14892.f16877).f9059.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f14896;
        if (z) {
            m7834(new C4197(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f14896;
        if (z) {
            m7834(new C4500(i, String.valueOf(charSequence)));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f14896;
        if (!z) {
            return z;
        }
        m7834(new C2890(i, i2));
        return true;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m7832(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m7833() {
        int i = this.f14889 - 1;
        this.f14889 = i;
        if (i == 0) {
            ArrayList arrayList = this.f14894;
            if (!arrayList.isEmpty()) {
                ((C2734) this.f14892.f16877).f9048.mo211(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f14889 > 0;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7834(InterfaceC1400 interfaceC1400) {
        this.f14889++;
        try {
            this.f14894.add(interfaceC1400);
        } finally {
            m7833();
        }
    }
}
